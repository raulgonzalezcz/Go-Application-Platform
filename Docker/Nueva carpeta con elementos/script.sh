#! /bin/bash
docker build -t $1 .
docker run -d -p 80:80 $1
