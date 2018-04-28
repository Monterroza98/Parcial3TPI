FROM payara/micro
RUN wget -O /opt/payara/postgresql-42.2.2.jar https://jdbc.postgresql.org/download/postgresql-42.2.2.jar

ADD ManttoWebApp-web-1.0-SNAPSHOT.war  /opt/payara/
ADD asadmin.txt /opt/payara


ENTRYPOINT ["java", "-jar", "/opt/payara/payara-micro.jar", "--addJars", "/opt/payara/postgresql-42.2.2.jar", "--postbootcommandfile", "asadmin.txt", "--deploy", "/opt/payara/ManttoWebApp-web-1.0-SNAPSHOT.war"]

#ManttoWebApp-web-1.0-SNAPSHOT.war
