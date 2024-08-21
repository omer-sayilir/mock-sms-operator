# Kolaysoft Mock Sms Operator

## Kullanimi

Uygulama Telsam operatorune benzer bir yapi kullanmaktadir

peyk uygulamasinda /entconf/notification/conf dosyasinda Telsam url'i yerine uygulama url'i yazildiginda sms operatoru gibi davranacaktir.

gelen sms'leri local'deki bir veritabaninda tutmaktadir

## Veritabani

h2 veritabani dosya yolu:
~/smsdb

h2 consola ulasmak icin:
http://localhost:27027/h2-console

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


## Docker image olusturma ve projeyi calistirma
docker build -t mocksmsoperator:latest . 

docker run -p 27027:27027 mocksmsoperator 