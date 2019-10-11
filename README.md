# VALIDITY 
#####Take home exercise

This is a Spring Boot application made using Apache Maven.
 
I have used the advanced dataset and I've got the expected output.

Steps to run the project:

1. Install Apache Maven if you dont have it installed from here (https://maven.apache.org/install.html)
2. After installing Maven, clone the repository and cd into it
3. Run the command: `mvn install` to install all the dependencies
3. Run the command: `mvn spring-boot:run` to run the application

To test the application open any API testing tool like Postman and make a GET request to the root endpoint i.e. `localhost:8080/`

A JSON Object will be returned with the duplicate and non-duplicate records.
