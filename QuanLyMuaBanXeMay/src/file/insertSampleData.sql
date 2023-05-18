select * from MotobikeType
select * from Motobike 

---------------------------
go
insert into dbo.MotobikeType(mType_ID, mType_Name) values ('loaixe1','xe m?i');
insert into dbo.MotobikeType(mType_ID, mType_Name) values ('LX01','Xe s?');
insert into dbo.MotobikeType(mType_ID, mType_Name) values ('LX02','Xe tay ga');
insert into dbo.MotobikeType(mType_ID, mType_Name) values ('LX03','Xe côn tay');
insert into dbo.MotobikeType(mType_ID, mType_Name) values ('LX04','Xe mô tô');
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