FROM openjdk:8-jdk-alpine
RUN mkdir -p /opt/app/logs
ADD /target/*.jar /opt/app/app.jar
EXPOSE 8080
CMD java -jar /opt/app/app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]