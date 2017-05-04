FROM williamyeh/java8

RUN apt-get -y update && apt-get install -y maven

WORKDIR /docker-mysql

ADD settings.xml /root/.m2/settings.xml
ADD pom.xml /docker-mysql
ADD src /docker-mysql/src

RUN cp /docker-mysql/target/docker-mysql-1.0-SNAPSHOT.jar /docker-mysql/app.jar
RUN sh -c 'touch /docker-mysql/app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /docker-mysql/app.jar" ]