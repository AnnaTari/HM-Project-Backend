# LotteryApp

In this project, we are using Java SDK version 17 and Spring Boot version 3.1.4, while also employing Maven to manage our project dependencies through the pom.xml file.
 
## Running the application

You can run this application like any other Java project. We are using an H2 database, which is created with scripts located under resources. The DDL statements are in the schema.sql file, and the DML statements are in the data.sql file. When the application is running, you can access the database via the browser at localhost:8080/h2-console. You can enter the following information:
- Driver class: org.h2.Driver
- JDBC URL: jdbc:h2:mem:lottery
- User Name: sa
- Password: (left empty)
  
After for example creating new events while the application is running, you can always check the changes this way. The data.sql file also contains the Admin user data, which you can use to log in to our login page. We placed under the resources folder examples of soccer images which you can use when creating events. 
