
# this is a very underwhelming Dockerfile.  There is a lot that we're not doing
# for the sake of speed of prototyping (i.e. we should be creating a tomcat user, etc)


# we would actually build our own base image using ansible in the real world.
# for prototyping we're going to trust the interwebz
FROM isuper/java-oracle:server_jre_8

# tomcat uses /tmp as a working directory
VOLUME /tmp

ADD sprangd.jar /sprangd.jar

# touch the jar so that we have a modification time with it
RUN bash -c 'touch /sprangd.jar'

# start our uber spring-boot jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/sprangd.jar"]