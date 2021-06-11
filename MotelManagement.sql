--DTB Quan Ly Phong Tro
CREATE DATABASE Motel;
USE Motel;

CREATE TABLE Client(
	ID_Client VARCHAR(10) NOT NULL PRIMARY KEY,
	Name_Client VARCHAR(50) NOT NULL,
	CMND VARCHAR(12) NOT NULL,
	Sex VARCHAR(10), 
	DOB Date,
	Home_Town VARCHAR(200),
	Phone_Number VARCHAR(12) NOT NULL
);

CREATE TABLE TypeRoom(
	ID_Type VARCHAR(10) NOT NULL PRIMARY KEY,
	Title VARCHAR(50) NOT NULL,
	Money INT,
	amount_people INT
);

CREATE TABLE Room(
	ID_Room VARCHAR(10) NOT NULL PRIMARY KEY,
	Room_Title VARCHAR(50) NOT NULL,
	ID_Type VARCHAR(10) NOT NULL REFERENCES TypeRoom(ID_Type)
);

CREATE TABLE Contract(
	ID_Contract VARCHAR(10) NOT NULL PRIMARY KEY,
	ID_representativeClient VARCHAR(10) NOT NULL REFERENCES Client(ID_Client),
	ID_Room VARCHAR(10) NOT NULL REFERENCES Room(ID_Room),
	Date_Enroll Date,
	Date_End Date,
	status VARCHAR(20),
);


CREATE TABLE Bill(
	ID_Bill VARCHAR(10) NOT NULL PRIMARY KEY,
	ID_Contract VARCHAR(10) NOT NULL REFERENCES Contract(ID_Contract),
	Date_Note Date,
	Electric INT,
	Water INT,
	Internet INT,
	Money_Room INT,
	Cost INT
);

CREATE TABLE Room_Info(
	ID_Room VARCHAR(10) NOT NULL REFERENCES Room(ID_Room),
	ID_Client VARCHAR(10) NOT NULL REFERENCES Client(ID_Client),
	ID_Contract VARCHAR(10) NOT NULL REFERENCES Contract(ID_Contract)
);


CREATE TABLE Account(
	ID_Client VARCHAR(10) NOT NULL REFERENCES Client(ID_Client),
	Username VARCHAR(50) UNIQUE NOT NULL,
	Password VARCHAR(50) NOT NULL,
);

--------------------------------------------------------------------------------------
------------------------------Client------------------------------
SELECT * FROM Client;

INSERT INTO Client VALUES('C0001','Tran Nhan Duc','092200000295','Nam','Jan 24 1997','Khanh Hoa','0939635855');
INSERT INTO Client VALUES('C0002','Nguyen Dinh Phuoc','092200000290','Nam','Sep 4 1997','Kien Giang','0839635895');
INSERT INTO Client VALUES('C0003','Nguyen Thi Nhien','092200000260','Nu','Sep 10 1999','Kien Giang','0839635890');
INSERT INTO Client VALUES('C0004','Nguyen Thi Nhien','092200000260','Nu','Sep 10 1999','Kien Giang', '0839635890');

------------------------------Type Room------------------------------
SELECT * FROM TypeRoom;
INSERT INTO TypeRoom VALUES ('T1','Loai 1', 800000, 1);
INSERT INTO TypeRoom VALUES ('T2','Loai 2', 1000000, 2);
INSERT INTO TypeRoom VALUES ('T3','Loai 3', 1500000, 4);

------------------------------Room------------------------------
SELECT * FROM Room;
INSERT INTO Room VALUES ('P01','Phong so 1', 'T1');
INSERT INTO Room VALUES ('P02','Phong so 2', 'T1');
INSERT INTO Room VALUES ('P03','Phong so 3', 'T1');
INSERT INTO Room VALUES ('P04','Phong so 4', 'T1');
INSERT INTO Room VALUES ('P05','Phong so 5', 'T1');
INSERT INTO Room VALUES ('P06','Phong so 6', 'T1');
INSERT INTO Room VALUES ('P07','Phong so 7', 'T2');
INSERT INTO Room VALUES ('P08','Phong so 8', 'T2');
INSERT INTO Room VALUES ('P09','Phong so 9', 'T3');
INSERT INTO Room VALUES ('P10','Phong so 10', 'T3');
INSERT INTO Room VALUES ('P11','Phong so 11', 'T3');

------------------------------Contract------------------------------
SELECT * FROM Contract;
INSERT INTO Contract VALUES('HD001','C0003','P01','Jun 5 2021',null,'live');
INSERT INTO Contract VALUES('HD002','C0001','P07','Jun 8 2021',null,'live');

------------------------------Bill------------------------------
SELECT * FROM Bill;
INSERT INTO Bill VALUES('B0001','HD001','Jul 5 2021', 12, 8, 1, 800000, 937000);
INSERT INTO Bill VALUES('B0002','HD002','Jul 8 2021', 20, 13, 1, 1000000, 1209000);

------------------------------Room Info------------------------------
SELECT * FROM Room_Info
INSERT INTO Room_Info VALUES ('P01', 'C0003', 'HD001');
INSERT INTO Room_Info VALUES ('P07', 'C0001', 'HD002');
INSERT INTO Room_Info VALUES ('P07', 'C0002', 'HD002');

---------------------------------------Account-----------------------------------------
SELECT * FROM Account;
INSERT INTO Account VALUES('C0001','duc','duc123');
INSERT INTO Account VALUES('C0002','phuoc','phuoc123');
INSERT INTO Account VALUES('C0003','nhien','nhien123');


-------------------------------------------------------------------------------

SELECT RI.ID_Room, R.Room_Title, R.ID_Type, CL.Name_Client, C.status
FROM Room_Info RI JOIN Room R ON RI.ID_Room=R.ID_Room
				JOIN Contract C ON RI.ID_Contract = C.ID_Contract
				JOIN Client CL ON RI.ID_Client = CL.ID_Client
				


SELECT * FROM TypeRoom
SELECT * FROM Room
SELECT * FROM Client
SELECT * FROM Contract
SELECT * FROM Room_Info

DELETE Room_Info WHERE ID_Contract='HD005'
DELETE Contract WHERE ID_Contract='HD009'



SELECT R.ID_Room, R.ID_Type, R.Room_Title, C.Name_Client, Co.status 
FROM Contract Co JOIN Room R ON Co.ID_Room=R.ID_Room 
				JOIN Client C ON Co.ID_representativeClient=C.ID_Client;


SELECT * 
FROM Room R JOIN Contract C ON R.ID_Room = C.ID_Room

--So luong ID cao nhat Client
SELECT MAX(ID_Client) AS MAX_ID FROM Client

--Cap nhat thong tin cho Client
UPDATE Client SET Name_Client='Tran', CMND='34', Sex='Khac', DOB='2011-02-02',Home_Town='Ha Noi',Phone_Number='324432' WHERE ID_Client='C0005'; 

--Xoa thong tin khach hang
DELETE Client WHERE ID_Client='C0005' AND Name_Client='Tran';

--set ID cao nhat cua Contract
SELECT MAX(ID_Contract) AS MAX_ID FROM Contract

--Co PhoneNumber_Client xuat ra Name_Client
SELECT ID_Client FROM Client WHERE Phone_Number='0939635855';

SELECT * FROM Contract
DELETE Contract WHERE Date_Enroll='2021-06-09'

SELECT * FROM Bill

--Cap nhat thong tin hop dong
UPDATE Contract SET ID_representativeClient=?, ID_Room=?, Date_Enroll=? WHERE ID_Contract=?;

--Xoa hop dong
DELETE Contract WHERE ID_Contract='HD004';

--Nhap ID COntract -> ID Room, Amount
SELECT R.ID_Room, T.amount_people FROM Room R JOIN Contract C ON R.ID_Room=C.ID_Room JOIN TypeRoom T ON R.ID_Type=T.ID_Type WHERE ID_Contract='HD002'

--Nhap ID Contract -> thong tin Room Mate
SELECT RI.ID_Room, RI.ID_Contract, RI.ID_Client, C.Name_Client FROM Room_Info RI JOIN Client C ON RI.ID_Client=C.ID_Client WHERE ID_Contract='HD001'

--Tinh tong so luong nguoi hien tai co trong phong
SELECT COUNT(*) AS amountOfPeople FROM Room_Info WHERE ID_Contract='HD002'


--Hien thi thong tin table Contract
SELECT Co.ID_Contract, Ci.Name_Client, R.ID_Type, R.ID_Room, R.Room_Title, Co.Date_Enroll, Co.Date_End, Co.status 
FROM Contract Co JOIN Client Ci ON Co.ID_representativeClient=Ci.ID_Client
				JOIN Room R ON Co.ID_Room=R.ID_Room

--Hien thi thong tin table Account
SELECT A.ID_Client, C.Name_Client, A.Username, A.Password FROM Account A JOIN Client C ON A.ID_Client=C.ID_Client


--Cap nhat tai khoan Account
UPDATE Account SET Username='nhien', Password='nhien000' WHERE ID_Client='C0003'

--Xoa tai khoan
DELETE Account WHERE ID_Client='C0003'

--


SELECT B.ID_Bill, C.ID_Contract, C.ID_Room, C.status, C.Date_Enroll, B.Date_Note, B.Electric, B.Water, B.Internet,B.Money_Room,B.Cost
FROM Bill B JOIN Contract C ON B.ID_Contract=C.ID_Contract

SELECT MAX(ID_Bill) AS MAX_ID FROM Bill

SELECT * FROM Contract

--Danh sach hop dong co ngay dang ky la ngay 10
SELECT Co.ID_Contract,Co.ID_Room,Ci.Name_Client, Co.Date_Enroll
FROM Contract Co JOIN Client Ci ON Co.ID_representativeClient=Ci.ID_Client
WHERE Day(Date_Enroll)='10'




SELECT R.ID_Room, R.ID_Type, R.Room_Title, C.Name_Client, Co.status 
FROM Contract Co JOIN Room R ON Co.ID_Room=R.ID_Room 
				JOIN Client C ON Co.ID_representativeClient=C.ID_Client
WHERE Co.status='live'
