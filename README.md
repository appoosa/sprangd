# Sprangd

Simple playground for testing spring boot, spring data, hibernate, angular, docker.

## Setup

Note:  For all commands below, use gradlew for linux/osx based systems or
gradle.bat for windows based systems.  For the purpose of exxamples, we use
gradlew.

**To generate IntelliJ project files:**

    gradlew idea

**To locally run the application (outside of docker, for now):**

    gradlew bootRun

Note: we have devtools installed, allowing you to view changes without having
to restart tomcat.  If you change static content, just relfresh the browser. If
you modify java/groovy, do a simple 'Make Project' in IntelliJ (very fast).

To pull up the main page, direct your web browser to http://localhost:8080.

## Packaging into docker image

*You must have docker installed.  For OSX and Windows based systems, use the
docker toolbox to install the necessary components.*

**To package the application in a docker image:**

    gradlew docker

**To run the image:**

    docker run --name sprangd -p 8080:8080 projekt202.com/spring:0.0.1

To pull up the main page:

OSX (machine_name=default if you have not modified it):

    open http://${docker-machine ip <machine_name>}:8080