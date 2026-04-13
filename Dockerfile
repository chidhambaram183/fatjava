# Use Eclipse Temurin 21 JRE (maintained and publicly available)
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copy the built JAR file from the target directory
COPY target/*.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]