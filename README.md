# Mock SMS Operator

## Overview

Mock SMS Operator is a Java-based application that simulates the behavior of an SMS operator, similar to the Telsam operator. The project leverages modern Java technologies, including Java 21, Spring Boot 3, and an H2 in-memory database. It also provides Docker support for easy deployment and testing.

## Features

- **Mock SMS Operator**: Acts as an SMS operator when integrated with the application.
- **Local Database Storage**: Stores incoming SMS messages in a local H2 database.
- **Dockerized Environment**: Easily build and run the application using Docker.

## Usage

The application will then act as an SMS operator, storing incoming SMS messages in the local database.

```
curl --location 'http://localhost:27027/sms/create' \
--header 'Content-Type: application/json' \
--header 'Authorization: Basic 111sYXlzb2Z0OmtvbGF5c29mdDAwKio=' \
--data '{
    "type": 1,
    "sendingType": 0,
    "title": "X tarihli tekil test",
    "content": "sometext omer",
    "number": [90545111111],
    "encoding": 0,
    "sender": "KLYSFT",
    "periodicSettings": null,
    "sendingDate": null,
    "validity": 60,
    "pushSettings": {
        "url": "https://yourdomain/api/sms/webhook/sms"
    }
}'
```

```
curl --location 'http://localhost:27027/sms/list-item' \
--header 'Content-Type: application/json' \
--header 'Authorization: Basic 111sYXlzb2Z0OmtvbGF5c29mdDAwKio=' \
--data '{
    "pkgID": 66,
    "uuid": null,
    "target": null,
    "operator": null,
    "state": null,
    "startDate": null,
    "finishDate": null,
    "pageIndex": 0,
    "pageSize": 100
}'

```

## Database

The application uses an H2 database to store SMS records. The database is initialized with the following configuration:

- **Database File Path**: `~/smsdb`
- **Accessing H2 Console**: You can access the H2 database console via `http://localhost:27027/h2-console`.

The database schema is defined as follows:

```sql
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
```

## Building and Running the Docker Image

build and run the Docker image for the Kolaysoft Mock SMS Operator by following these steps:

1. **Build the Docker Image**:
   ```bash
   docker build -t mocksmsoperator:latest .

2. **Run the Docker Container**:
   ```bash
   docker run -p 27027:27027 mocksmsoperator


This will start the application and make it accessible on http://localhost:27027

## Conclusion

The Mock SMS Operator provides a simple and effective way to simulate an SMS operator for testing and development purposes. With its easy setup and Docker support, it’s a convenient tool for developers working with SMS services.

