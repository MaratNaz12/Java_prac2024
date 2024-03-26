CREATE TABLE ContactInfo
(
    Id         serial PRIMARY KEY,
    TelNumber1 varchar(12),
    TelNumber2 varchar(12),
    Email      varchar(30),
    Address varchar (40),
    Name varchar(50) unique NOT NULL
);