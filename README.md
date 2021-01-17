# test-back

JAVA:

JAVA IDE: IntelliJ Community edition: https://www.jetbrains.com/idea/
JAVA 11 JDK: AdoptOpenJDK: https://adoptopenjdk.net/

Frameworks:
Spring boot:
https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/html/using-spring-boot.html#using-boot

Spring data jpa:
https://docs.spring.io/spring-data/jpa/docs/2.3.0.RELEASE/reference/html/#reference

Test application:

Springboot test-back:
- when started, spring boot writes some logs you can see in the console when you run or debug the application from intellij.
  one of the log is: Tomcat started on port(s): 8080
  normally, it should be port 8080 if nothing else run already on this port.

You can test the rest api defined in the project at the following address: http://localhost:8080/persons
( of course change the port if it is not the same in your logs).

The result should be JSON response: [{"id":1,"lastname":"Doe","firstname":"John"}]

Database: the database is a H2 database where the file is in the folder /data of the project.
The database engine runs only when the spring boot project is started.
There is only one table "person".

The table has been created when the spring boot project has been launched for the first time by using component "liquibase".
(https://www.liquibase.org/)
it allows to create/ modify tables, create / modify / delete data when starting the project.
Once a change has been executed, it is logged in database and so won't be rerun at the next run of the spring boot project.
Here the loquibase configuration files are in folder resources/changelogs.
You cannot modify the existing changes in the liquibase files. You can only add new changes in those files.

