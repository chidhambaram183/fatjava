# Use the official OpenJDK 21 image
FROM openjdk:21

# Copy the built JAR file from the target directory
COPY target/*.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]
