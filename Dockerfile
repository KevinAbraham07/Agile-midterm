FROM eclipse-temurin:17
COPY target/todo-management-app.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]