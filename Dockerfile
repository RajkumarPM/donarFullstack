# Use Maven image to build the application
FROM maven:3.8.5-openjdk-17 AS build
COPY . /app
WORKDIR /app
RUN mvn clean package -DskipTests

# Start with a smaller JDK image for running the application
FROM openjdk:17.0.1-jdk-slim

# Copy the built JAR file from the previous stage
COPY --from=build /app/target/full-0.0.1-SNAPSHOT.jar full.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java","-jar","full.jar"]