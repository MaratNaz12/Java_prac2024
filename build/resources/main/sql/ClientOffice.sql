CREATE TABLE ClientOffice(
                        Id serial PRIMARY KEY,
                        ClientId integer NOT NULL,
                        OfficeId integer NOT NULL,
                        FOREIGN KEY (ClientId) REFERENCES Client(Id),
                        FOREIGN KEY (OfficeId) REFERENCES Office(Id)

);