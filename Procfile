#Heroku Procfile that specifies the commands that are executed by the app on startup
web: ./mvnw package && echo "Heroku Port: $PORT" && java -Dquarkus.http.port=$PORT -jar target/cep-service-default-runner.jar
