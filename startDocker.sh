#!/bin/sh
docker build -t randoop-container . &&
docker run -d --name T9 randoop-container
