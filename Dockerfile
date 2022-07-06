FROM gradle:jdk11
RUN mkdir /demo
WORKDIR /demo
COPY . /demo
RUN gradle bootjar

FROM adoptopenjdk:11-openj9-focal
COPY --from=0 /demo/build/libs/demo-*.jar demo.jar
EXPOSE 8080
CMD [ "java", "-Xshareclasses", "-Xquickstart", "-jar", "demo.jar"]