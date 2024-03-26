CREATE TABLE Office(
                       Id serial PRIMARY KEY,
                       Name varchar(50) unique NOT NULL,
                       ContactId integer,
                       FOREIGN KEY (ContactId) REFERENCES ContactInfo(Id)
);