# ka66-mail-service

`ka66-mail-service` is a simple Spring Boot application designed to send emails using a configurable SMTP server.

## Features

- Send simple email messages
- Swagger UI for API documentation
- JUnit tests for email service

## Technologies

- Java 17
- Spring Boot
- Spring Mail
- Springdoc OpenAPI
- JUnit
- Gradle

## Getting Started

### Prerequisites

- Java 17
- Gradle

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/redx-tg47/ka66-mail-service.git
   cd ka66-mail-service

2. Configure SMTP settings in src/main/resources/application.properties:
   ``` properties
   spring.mail.host=smtp.your-email-provider.com
   spring.mail.port=587
   spring.mail.username=your_email@example.com
   spring.mail.password=your_password
   spring.mail.properties.mail.smtp.auth=true
   spring.mail.properties.mail.smtp.starttls.enable=true


3. Build the project:

   ```bash
   ./gradlew clean build

4. Running the Application

   ```bash
   ./gradlew bootRun
   
5. Access Swagger UI

   Once the application is running, you can access the Swagger UI to explore the API endpoints:
   http://localhost:8080/swagger-ui.html


### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.2/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.2/gradle-plugin/packaging-oci-image.html)
* [Java Mail Sender](https://docs.spring.io/spring-boot/3.4.2/reference/io/email.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.2/reference/web/servlet.html)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)