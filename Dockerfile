FROM openjdk:8
COPY /target/departments-0.0.1-SNAPSHOT.jar /departments-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "/departments-0.0.1-clSNAPSHOT.jar"]