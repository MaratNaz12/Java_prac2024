CREATE TABLE Client(
                            Id serial PRIMARY KEY,
                            ContactId integer,
                            FOREIGN KEY (ContactId) REFERENCES ContactInfo(Id)
);