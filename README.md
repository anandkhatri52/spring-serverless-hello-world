# Spring serverless - Spring Cloud Function 

#### This application is a sample application on spring serverless using spring cloud function feature

### Spring Cloud Function in Packages:
We have exposed @Bean as method Apart from this, we could also write our software as classes that implement 
the functional interface Function<T, R>. We can specify the packages to scan for relevant beans in the application.yml file.

**Note:** The endpoint is the name of the class that implements the functional interface.

```
spring:
  cloud:
    function:
      scan:
        packages: com.example.springserverlesshelloworld.functions
```        

## How to run:
As it's simple spring boot application: you can run  by `mvn spring-boot:run` command.
* Application will be up on 8080 port.
* As we created spring bean with name `uppercase`, API will be expose on `localhost:8080/uppercase`

```
 $ curl -H "Content-Type: text/plain" localhost:8080/uppercase -d Hello
```

```
curl --location --request POST 'localhost:8080/test/greeter' \
--header 'Content-Type: text/plain' \
--data-raw 'Anand'
```

## Reference documents:
* https://docs.spring.io/spring-cloud-function/docs/3.1.1/reference/html/spring-cloud-function.html
* https://www.baeldung.com/spring-cloud-function