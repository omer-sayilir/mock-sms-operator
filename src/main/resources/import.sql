CREATE SEQUENCE SMS_RECORD_SEQ START WITH 198001 INCREMENT BY 1;

CREATE TABLE sms_record (
                            id INT DEFAULT NEXT VALUE FOR SMS_RECORD_SEQ PRIMARY KEY,
                            receiver VARCHAR(255),
                            state INT,
                            received_date TIMESTAMP DEFAULT NOW(),
                            sending_date TIMESTAMP,
                            delivery_date TIMESTAMP,
                            credit INT
);