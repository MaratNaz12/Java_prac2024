CREATE TABLE Operation(
                        Id serial PRIMARY KEY,
                        ToAccId integer NOT NULL,
                        FromAccId integer NOT NULL,
                        OperationTime  TIMESTAMP NOT NUll,
                        Sum int NOT NULL,
                        FOREIGN KEY (ToAccId) REFERENCES Account(Id),
                        FOREIGN KEY (FromAccId) REFERENCES Account(Id)
);