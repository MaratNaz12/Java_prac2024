CREATE TABLE client (
                        id SERIAL  PRIMARY KEY ,
                        name VARCHAR(70) NOT NULL,
                        telnumber1 VARCHAR(15) NOT NULL,
                        telnumber2 VARCHAR(15),
                        email VARCHAR(50),
                        address VARCHAR(70)
);