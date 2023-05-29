FROM ubuntu

# Install base pkgs
RUN apt update \
    && echo "y" | apt install default-jdk wget\
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*


#Install Python3.9
RUN wget https://bootstrap.pypa.io/get-pip.py
RUN python3 get-pip.py
RUN pip3 install --no-cache-dir pandas


# Install Maven
ARG MAVEN_VERSION=3.6.3
ARG BASE_URL=https://apache.osuosl.org/maven/maven-3/${MAVEN_VERSION}/binaries

RUN wget ${BASE_URL}/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
 && tar -xvf apache-maven-${MAVEN_VERSION}-bin.tar.gz \
 && mv apache-maven-${MAVEN_VERSION} /opt/ \
 && rm -f apache-maven-${MAVEN_VERSION}.tar.gz

ENV MAVEN_HOME /opt/apache-maven-${MAVEN_VERSION}
ENV PATH="$MAVEN_HOME/bin:$PATH"

WORKDIR .
#CMD ["mvn","--version"]

ADD main.py .
ADD ./project ./project
#ADD ./shared_dir ./shared_dir
CMD ["python3","main.py","VCardBean"]
