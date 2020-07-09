FROM openjdk:11
COPY ./target/springboot-jwt.war /opt/springboot-jwt.war
WORKDIR /opt
CMD ["java", "-jar", "/opt/springboot-jwt.war"]
