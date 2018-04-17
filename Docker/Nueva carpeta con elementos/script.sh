#! /bin/bash
docker build -t $1 .
docker run -p 80:80 -d $1
