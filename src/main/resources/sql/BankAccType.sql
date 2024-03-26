CREATE TABLE BankAccType(
    Id serial PRIMARY KEY,
    Name varchar(50) unique NOT NULL,
    Profit int NOT NULL CHECK (Profit > 0),
    DayPeriod int NOT NULL CHECK (DayPeriod > 0),
    MaxDebit int NOT NUll CHECK (MaxDebit >= 0),
    MinDebit int NOT NULL CHECK (MinDebit >= 0),
    MaxAccrual int NOT NULL CHECK (MaxAccrual >= 0),
    MinAccrual int NOT Null CHECK (MinAccrual >= 0)
);