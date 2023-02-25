# Spring Native Example

Spring Native Example using Spring Boot 3.0 support for native image constructions using Buildpacks.io

The example has a few different components:

1) The ```spring-example-web``` is a simple as they come web app that uses the ```spring-boot-starter-parent``` has its parent.


## 1. Spring Boot Parent Application
To build and test the ```spring-example-web```

```
 mvn -Pnative spring-boot:build-image
 ```

 To Run the Spring Boot Parent Version
 ```
 $ docker run --rm -p 8080:8080 spring-example-web:0.0.1-SNAPSHOT
```

To Test Endpoint:
http://localhost:8080/

