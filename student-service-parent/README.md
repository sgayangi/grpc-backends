### Student Service

This is the Spring Boot application for a gRPC application. 

To build the docker image,
```agsl
docker buildx create --use
docker buildx build --platform linux/amd64,linux/arm64 -t <docker-image-name>:<tag> --push .
```

Proto files were added to student-server-common/src/main/proto folder.
To generate the stubs for the proto files, run the following from the student-server-common directory.
```agsl
./mvnw clean install 
```