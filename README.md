# Sprangd

Simple playground for testing spring boot, spring data, hibernate, angular, docker.

## Setup

Note:  For all commands below, use gradlew for linux/osx based systems or
gradle.bat for windows based systems.  For the purpose of exxamples, we use
gradlew.

To do anything docker related, you must have docker installed.  If you haven't done so, use
docker toolbox to get docker running on your system.

*We have devtools installed, allowing you to view changes without having
to restart tomcat.  If you change static content, just refresh the browser. If
you modify java/groovy, do a simple 'Make Project' in IntelliJ (very fast).*

### Running the project

Select H2 or Postgres below.  When ready, pull up the main page by directing your browser to http://localhost:8080.

### IntelliJ Project Generation

    gradlew idea

### Run project with H2

    # Use H2, an in memory database that will lost all content if tomcat is restarted
    SPRING_PROFILES_ACTIVE=test ./gradlew bootRun

### Run project against postgres

    # first start up postgres in a docker container
    docker run --name postgres -e POSTGRES_PASSWORD=mysecretpassword --net host -d -p 5432:5432 postgres

    # next, start up spring boot and tell it to use the local spring profile and provide the docker machine IP address
    SPRING_PROFILES_ACTIVE=local DB_HOSTNAME="$(docker-machine ip default)" ./gradlew bootRun

## Packaging into docker image


### Build Spring Boot docker image

    gradlew docker

### Run the Spring Boot docker container against Postgres

    # start postgres container
    docker run --name postgres -e POSTGRES_PASSWORD=mysecretpassword --net host -d -p 5432:5432 postgres

    # start spring boot
    docker run --name sprangd -e SPRING_PROFILES_ACTIVE=local -e DB_HOSTNAME=$(docker-machine ip default) -p 8080:8080 projekt202.com/sprangd:0.0.1

To pull up the main page:

*OSX*:

    open http://${docker-machine ip default}:8080