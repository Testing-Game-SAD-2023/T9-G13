#!/bin/sh
sudo chmod 666 /var/run/docker.sock &&
docker build -t randoop-container . &&
docker run -d -v $1/:/repo --dns 8.8.8.8 --name T9 randoop-container
docker pause T9
