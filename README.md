# Instructions

## User app

1. Open a terminal in the project folder
2. cd user
3. chmod +x gradlew
4. ./gradlew bootRun

## Proxy app

1. Open another terminal in the project folder
2. cd proxy
3. chmod +x gradlew
4. ./gradlew bootRun

## Test user app

1. Open a terminal
2. curl localhost:8090/user/user

## Test user app through proxy

1. Open a terminal
2. curl localhost:8080/user-service/user/user

You can also use postman importing leantech.postman_collection.json collection file.