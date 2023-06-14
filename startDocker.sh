#!/bin/sh
sudo chmod 666 /var/run/docker.sock &&
docker build -t randoop-container . &&
docker run -i -t -v $1/:/root/repo --dns 8.8.8.8 --name T9 randoop-container
#docker pause T9
