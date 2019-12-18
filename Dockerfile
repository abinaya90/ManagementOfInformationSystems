FROM openjdk:8
MAINTAINER Abinaya Balaji <abhinayabalaji90@gmail.com>
ADD target/employee-dtls-mysql.jar employee-dtls-mysql.jar
#EXPOSE 8085
CMD ["java", "-jar", "employee-dtls-mysql.jar"]