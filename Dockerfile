FROM jeanblanchard/java:jdk-8

RUN mkdir /app

WORKDIR /app

COPY /build/libs/produtor*.jar /app/produtor.jar

EXPOSE 8080
ENV JAVA_TOOL_OPTIONS -Dfile.encoding=UTF8 -Duser.country=BR -Duser.language=pt
CMD ["java", "-jar", "-Xmx512M", "-Xms512M", "produtor.jar"]