FROM amazoncorretto:21

COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src
RUN chmod +x ./gradlew
RUN ./gradlew build --exclude-task test

RUN cp ./build/libs/practice-0.0.1.jar ./app.jar
EXPOSE 8080

# Specify the command to run on container start
CMD ["java", "-jar", "app.jar"]
