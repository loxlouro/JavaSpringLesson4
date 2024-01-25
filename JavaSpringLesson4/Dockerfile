FROM wuleds/jdk21-tomcat10-ubuntu22:1.0

COPY out/artifacts/JavaSpringLesson4_jar /home/app/JavaSpringLesson4_jar


EXPOSE 8001:8001
ENTRYPOINT ["java","-jar","/home/app/JavaSpringLesson4_jar/JavaSpringLesson4.jar"]
