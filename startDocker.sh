#!/bin/sh
sudo chmod 666 /var/run/docker.sock &&
docker build -t randoop-container . &&
docker run -t -i -v ./shared_dir/:/shared_dir --dns 8.8.8.8 --name T9 randoop-container
