FROM ubuntu:18.04

ENV TZ=Europe/Warsaw

RUN apt update && apt-get install -y \ 
    vim \
    git \ 
    wget \ 
    zip \
    curl 

RUN apt-get install -y openjdk-8-jdk &&\
    export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64

RUN wget https://downloads.lightbend.com/scala/2.12.10/scala-2.12.10.deb &&\ 
    dpkg -i scala-2.12.10.deb

RUN apt-get update && apt-get install -y gnupg2

RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list &&\
    apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823 &&\
    apt-get update &&\
    apt-get install sbt

RUN apt-get install -y npm

RUN apt-get update

EXPOSE 9000
EXPOSE 3000

RUN useradd -ms /bin/bash soleksy
RUN adduser soleksy sudo

USER soleksy
WORKDIR /home/soleksy/
RUN mkdir /home/soleksy/volume/

VOLUME [ "/home/soleksy/volume/" ]
