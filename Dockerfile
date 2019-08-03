FROM openjdk:latest

ADD target/studentapp.war studentapp.war

EXPOSE 8080

CMD ["java", "-jar", "studentapp.war"]