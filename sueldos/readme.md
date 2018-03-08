## Clientes

The idea of this application is to learn how to use swagger and the H2 database by creating an application.

### Running the application

```
mvn install
mvn spring-boot:run
```

### What's H2
As the web page said, its (http://www.h2database.com)
* A very fast, open source, JDBC API
*  Embedded and server modes; in-memory databases
* Browser based Console application
* Small footprint: around 1.5 MB jar file size

#### The H2 database ui console
This application have a web ui console to explore the database. It can be find in here: ( http://localhost:8080/console/ )

This ui application is routed thanks to the `h2servletRegistration` method in the `HelloWorldConfiguration` class. This register the 
serverlet in the uri.

### What's swagger
As the web page said, its (https://swagger.io/)
Swagger is the world’s largest framework of API developer tools for the OpenAPI Specification(OAS), enabling development across the entire API lifecycle, from design and documentation, to test and deployment.

#### The swagger ui console
To access the swagger ui console enter http://localhost:8080/swagger-ui.html
