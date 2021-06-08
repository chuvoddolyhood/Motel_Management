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
	Phone_Number VARCHAR(10) NOT NULL
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

DROP TABLE Contract

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
	ID_representativeClient VARCHAR(10) NOT NULL REFERENCES Client(ID_Client),
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
INSERT INTO Client VALUES('C0001','Tran Nhan Duc','092200000295','Nam','Jan 24 1997','Khanh Hoa',0939635855);
INSERT INTO Client VALUES('C0002','Nguyen Dinh Phuoc','092200000290','Nam','Sep 4 1997','Kien Giang',0839635895);
INSERT INTO Client VALUES('C0003','Nguyen Thi Nhien','092200000260','Nu','Sep 10 1999','Kien Giang',0839635890);

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








