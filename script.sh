#!/bin/bash

for (( i = 2 ; i <= $1 ; i += 1 )) ; do
	cp -r ./projects/project_1 ./projects/project_$i 
done
