FROM openjdk:21
ADD target/MockSmsOperator-0.0.1-SNAPSHOT.jar MockSmsOperator-0.0.1-SNAPSHOT.jar
LABEL authors="omersayilir"
ENTRYPOINT ["java", "-jar", "MockSmsOperator-0.0.1-SNAPSHOT.jar"]