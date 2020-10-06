#Heroku Procfile that specifies the commands that are executed by the app on startup
web: echo "Heroku Port: $PORT"; ./mvnw package && java -Dquarkus.http.port=$PORT -jar target/cep-service-default-runner.jar
