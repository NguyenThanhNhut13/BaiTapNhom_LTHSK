USE [master]

go
CREATE DATABASE MotobikesManagement
go
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

-- account_ID nvarchar(50) NOT NULL,
-- account_Password nvarchar(255) NOT NULL,
go
CREATE TABLE Staff(
	staff_ID nvarchar(50) NOT NULL,
	account_ID nvarchar(50) NOT NULL,
	account_Password nvarchar(255) NOT NULL,
	staff_Name nvarchar(50) NULL,
	staff_Gender nvarchar(5) NULL,
	staff_DateOfBirth Date,
	staff_Address nvarchar(50) NULL,
	staff_Email nvarchar(50) NULL,
	staff_Salary float,
	staff_Phone nvarchar(13) NULL,
	staff_Position nvarchar(50) NULL,
	staff_Note nvarchar(50) NULL,
	
	
CONSTRAINT PK_Staff PRIMARY KEY CLUSTERED(
	staff_ID ASC 
)
)


go
CREATE TABLE Customers(
	customer_ID nvarchar(50) NOT NULL,
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
/*
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

*/


-- INSERT VALUES
select * from MotobikeType
select * from Motobike 

---------------------------
go
insert into dbo.MotobikeType(mType_ID, mType_Name) values ('loaixe1',N'xe mới');
insert into dbo.MotobikeType(mType_ID, mType_Name) values ('LX01',N'Xe số');
insert into dbo.MotobikeType(mType_ID, mType_Name) values ('LX02',N'Xe tay ga');
insert into dbo.MotobikeType(mType_ID, mType_Name) values ('LX03',N'Xe côn tay');
insert into dbo.MotobikeType(mType_ID, mType_Name) values ('LX04',N'Xe mô tô');
------------------------
go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000001','Honda Wave RSX', 'Honda', 109, '??', 'LX01', 22000000,200,2002);
go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000002','Wave Alpha 110cc', 'Honda', 109.1, 'xanh', 'LX01', 18190000, 300, 2002);
go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000003','Super Cub C125', 'Honda', 123.94, '??', 'LX01', 87890000,200,2000);
 go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000004',' Blade 2023', 'Honda', 109.1, '?en', 'LX01', 19250000,500,2004);
 -----------------------
 go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000005',' Sh Mode 125cc', 'Honda', 124.8, '??', 'LX02', 58190000, 200,2004);
  go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000006',' Vision', 'Honda', 109.5, '?en', 'LX02', 31690000,500,2012);
  go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000007',' Yamaha Mio M3 125', 'Yamaha', 125, '?en', 'LX02', 31950000,100,2017);
  go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000008',' Piaggio Libery #25 ', 'Piaggio', 125, 'tr?ng', 'LX02', 61900000, 400,2015);
 -----------------------
  go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000009','  Bluera Bike 110cc MSX', ' Bluera Bike', 110, 'xanh', 'LX03', 26050000,200,2015);
   go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000010',' Winner X', 'Honda', 149.1, '?en', 'LX03', 50050000,100,2023);
   go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000011',' CB150R The Streetster', 'Honda', 149.2, '?en', 'LX03', 105250000, 90, 2023);
   go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000012',' CBR150R', 'Honda', 149.2, '?en', 'LX03', 73250000, 300,2022);
--------------------
   go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000013',' Africa Twin 2023', 'Honda', 1084, '?en', 'LX04', 590250000,50,2023);
   go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000014','Yamaha R1M', 'Yamaha', 998 , '?en', 'LX04', 1200250000,20,2023);
   go
insert into dbo.Motobike(motobike_ID, motobike_Name, motobike_Manufacturer, motobike_Capacity, motobike_Color, mType_ID, motobike_Price, motobike_Quantity, motobike_ManufacturingYear)
 values ('MSX000015','Yamaha R15', 'Yamaha', 155, 'xanh', 'LX04', 72250000,100,2023);

 ----------------------
 
	
	
 -- INSERT VALUES Staff
 INSERT INTO Staff VALUES ('NV001', 'NV001', '123456789', N'Nguyễn Thanh Nhứt', N'Nam', '2003-10-13', N'Long An', 'thanhnhutcu@gmail.com', 50000000, '0901407421', N'Chủ tịch', N'Đang làm'),
						  ('NV002', 'NV002', '123456789',N'Nguyễn Thanh Phới', N'Nam', '2003-03-10', N'Đồng Tháp', 'nguyenthanhphoi2003@gmail.com', 45000000, '0878085650', N'Giám đốc', N'Đang làm'),
						  ('NV003', 'NV003', '123456789',N'Lê Thị Ngọc Mai', N'Nữ', '2002-02-15', N'TPHCM', 'lethingocmai15022002@gmail.com', 40000000, '0352594707', N'Phó Giám đốc', N'Đang làm'),
						  ('NV004', 'NV004', '123456789', N'Trương Nhật Đông', N'Nam', '2003-05-17', N'Long An', 'truongnhatdong4@gmail.com', 35000000, '0909090909', N'Quản lý', N'Đang làm')
						 
select * from Staff					


-- INSERT VALUES Customer
INSERT INTO Customers VALUES ('KH001', N'Nguyễn Văn A', N'Nam', '1990-01-01', '0987654321', N'Hà Nội'),
							 ('KH002', N'Trần Thị B',   N'Nữ',  '1995-06-30', '0912345678', N'Hồ Chí Minh'),
							 ('KH003', N'Lê Văn C',     N'Nam', '1985-12-15', '0911111111', N'Đà Nẵng'),
							 ('KH004', N'Hoàng Thị D',  N'Nữ',  '1998-03-22', '0977777777', N'Hải Phòng'),
							 ('KH005', N'Phạm Văn E',   N'Nam', '1992-09-10', '0966666666', N'Nha Trang')

Select* from Customers

							