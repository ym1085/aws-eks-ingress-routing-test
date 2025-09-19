FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8080

ENV JAVA_OPTS="-Xms512m -Xmx512m -XX:+UseG1GC"
ENV SPRING_PROFILES_ACTIVE=local

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS \
 -Dspring.profiles.active=${SPRING_PROFILES_ACTIVE} \
 -jar app.jar"]