# Stage 1: Build the JAR using Maven
FROM maven:3.8.5-openjdk-17 AS build
#
# # Set the working directory for the build
WORKDIR /app
#
# # Copy the root pom.xml and submodule pom.xml files to the container
# COPY ./pom.xml /app/student-service-parent/pom.xml
# COPY ./student-service-common/pom.xml /app/student-service-parent/student-service-common/pom.xml
# COPY ./student-service-server/pom.xml /app/student-service-parent/student-service-server/pom.xml
#
# # Copy the source code for the entire project
COPY . /app/student-service-parent
#
# # Build the Maven project, skipping tests for faster build
# RUN mvn -f /app/student-service-parent/pom.xml clean package -DskipTests

# Stage 2: Run the Spring Boot application
FROM openjdk:17.0.1

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR from the 'student-service-server' module
COPY --from=build /app/student-service-parent/student-service-server/target/student-service-server-*.jar /app/student-service-server.jar

# Expose port 9090
EXPOSE 9090

# Run the Spring Boot application on port 6565
ENTRYPOINT ["java", "-jar", "/app/student-service-server.jar"]

