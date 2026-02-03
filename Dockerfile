FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY build/libs/blue-green-demo-1.0.jar app.jar
# We don't set ENV here because Kubernetes will inject it
ENTRYPOINT ["java", "-jar", "app.jar"]