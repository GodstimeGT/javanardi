# javanardi
## Prerequisites
 - JDK 19
 - Maven Latest
## Getting Started

Clean and install dependencies

```sh
./mvnw clean install
```

Run test

```sh
mvn test   
```

Run application locally

```sh
./mvnw spring-boot:run
```

### Using docker:

Build the image

```sh
docker image build -t docker-java-jar:latest .   
```

Run the application on docker

```sh
docker run --rm -it -p 8080:8080/tcp docker-java-jar:latest 
```