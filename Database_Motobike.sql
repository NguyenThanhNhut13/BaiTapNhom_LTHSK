USE [master]

go
CREATE DATABASE MotobikesManagement

use MotobikesManagement
go 
CREATE TABLE Motobike(
	motobike_ID nvarchar(50) NOT NULL,
	motobike_Name nvarchar(50) NOT NULL,
	motobike_Manufacturer nvarchar(100) NULL,
	motobike_Capacity float NULL,
	motobike_Color nvarchar(50) NULL,
	mType_ID nvarchar(50) NOT NULL,
	motobike_Price float NULL,
	motobike_Quantity int NULL,
	motobike_ManufacturingYear int NULL,
	
CONSTRAINT PK_Product PRIMARY KEY CLUSTERED(
	motobike_ID ASC 
	)
)

go 
CREATE TABLE MotobikeType (
	mType_ID nvarchar(50) NOT NULL,
	mType_Name nvarchar(50) NOT NULL,
CONSTRAINT PK_ProductType PRIMARY KEY CLUSTERED(
	mType_ID ASC 
	)
)



go
CREATE TABLE Orders(
	order_ID nvarchar(50) NOT NULL,
	order_Date date NULL,
	motobike_ID nvarchar(50) NOT NULL,
	quantity int,
	order_Amount float,
CONSTRAINT PK_Orders PRIMARY KEY CLUSTERED(
	order_ID ASC 
	)
)

go
CREATE TABLE OrderDetail(
	order_ID nvarchar(50) NOT NULL,
	staff_ID nvarchar(50) NOT NULL,
	customer_ID nvarchar(50) NOT NULL,
	order_Note nvarchar(100),
	order_Status nvarchar(50) NULL,
CONSTRAINT PK_OrderDetail PRIMARY KEY CLUSTERED(
	order_ID ASC 
	)
)


go
CREATE TABLE Staff(
	staff_ID nvarchar(50) NOT NULL,
	account_ID nvarchar(50) NOT NULL,
	account_Password nvarchar(255) NOT NULL,
	staff_Name nvarchar(50) NULL,
	staff_Position nvarchar(50) NULL,
	staff_Gender nvarchar(5) NULL,
	staff_Note nvarchar(50) NULL,
	staff_Phone nvarchar(13) NULL,
	staff_Email nvarchar(50) NULL,
	staff_Address nvarchar(50) NULL,
	staff_Salary float,
	staff_Status nvarchar(50),
CONSTRAINT PK_Staff PRIMARY KEY CLUSTERED(
	staff_ID ASC 
)
)

go
CREATE TABLE CustomerType(
	cType_ID nvarchar(50) NOT NULL,
	cType_Name nvarchar(50) NULL,
CONSTRAINT PK_CustomerType PRIMARY KEY CLUSTERED(
	cType_ID ASC 
)
)

go
CREATE TABLE Customer(
	customer_ID nvarchar(50) NOT NULL,
	cType_ID nvarchar(50) NOT NULL,
	customer_Name nvarchar(50) NULL,
	customer_Gender nvarchar(5) NULL,
	customer_DateOfBirth date NULL,
	customer_Phone nvarchar(13) NULL,
	customer_Address nvarchar(50) NULL,
CONSTRAINT PK_Customer PRIMARY KEY CLUSTERED(
	customer_ID ASC 
)
)

--Set độ dài tối đa cho các chuỗi có chứa khoảng trắng 
GO
SET ANSI_PADDING ON
GO

--Thêm ràng buộc khóa ngoại cho các bảng 
	-- Motobike - MotobikeType
GO
ALTER TABLE [dbo].[Motobike]  WITH CHECK ADD  CONSTRAINT [FK_Motobike_mType] FOREIGN KEY([mType_ID])
REFERENCES [dbo].[MotobikeType] ([mType_ID])
ON UPDATE CASCADE
ON DELETE CASCADE

	--OrderDetail - Orders
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_Orders] FOREIGN KEY([order_ID])
REFERENCES [dbo].[Orders] ([order_ID])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_Orders]

	--Orders - Motobike
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK_Orders_Motobike] FOREIGN KEY([motobike_ID])
REFERENCES [dbo].[Motobike] ([motobike_ID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK_Orders_Motobike]
GO

	--OrderDetail - Customer
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_Orderdetail_Customer] FOREIGN KEY([customer_ID])
REFERENCES [dbo].[Customer] ([customer_ID])
ON UPDATE CASCADE
ON DELETE CASCADE

GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_Orderdetail_Customer]

	--OrderDetail - Staff
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_Staff] FOREIGN KEY([staff_ID])
REFERENCES [dbo].[Staff] ([staff_ID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_Staff]

	-- Customer - CustomerType
GO
ALTER TABLE [dbo].[Customer]  WITH CHECK ADD  CONSTRAINT [FK_Customer_CustomerType] FOREIGN KEY([cType_ID])
REFERENCES [dbo].[CustomerType] ([cType_ID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Customer] CHECK CONSTRAINT [FK_Customer_CustomerType]


--Set trạng thái có thể đọc và ghi dữ liệu vào db
USE [master]
GO
ALTER DATABASE [MotobikesManagement] SET  READ_WRITE 
GO


--ALTER TABLE dbo.OrderDetail ADD order_Status nvarchar(50) NULL;



-- Insert values

INSERT Account (acc_ID, acc_Password) VALUES (N'NV001',N'NV12345678')

INSERT Customer(customer_ID, cType_ID, customer_Name, customer_Gender, customer_Address, customer_Phone)
	VALUES (N'KH001',N'LKH001',N'Lê Thị Ngọc Mai ', N'Nữ', N'Phan Văn Trị p11 BT HCM', N'0352594707')

INSERT CustomerType(cType_ID, cType_Name) VALUES (N'LKH001',N'Khách hàng mới')

INSERT Orders(order_ID, staff_ID, customer_ID, order_Date, order_Amount)
	VALUES (N'HD001', N'NV001', N'KH001',  CAST(N'2021-12-03' AS Date), 15000000 )

INSERT OrderDetail(od_OrderID, od_ProductID, od_Quantity)
	VALUES (N'HD001', 'LK001', 5)

INSERT ProductType(pType_ID, pType_Name) 
	VALUES (N'LLK001', N'Linh kiện máy tính')

INSERT Product(product_ID, pType_ID, product_Name, manufacturer_ID, product_description, product_Quantity, product_WarrantyByMonth, product_Price)
	VALUES (N'LK001', N'LLK001', N'Chip 1xx', N'NSX001', NULL, 5000, 24, 1000000)

INSERT Staff(staff_ID, account_ID, staff_Name, staff_Position, staff_Phone, staff_CitizenID, staff_Email, staff_Address)
	VALUES (N'NV001', N'NV001', N'Lê Hoàng', N'Nhân viên bán hàng', N'0253594825', N'1234567891', N'Hoang@gmail.com', N'HCM' )
