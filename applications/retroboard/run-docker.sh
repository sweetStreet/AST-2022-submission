#!/bin/bash

usage() {
  echo "Run docker container with retroboard application"
  echo "Valid options:"
  echo " -h, prints this message."
  echo " -a PORT [4000], assigns application server binding port to localhost. Must be a number!!"
  echo " -p yes|no [no], run docker for production or not"
  echo " -n STRING [default], assigns a name to the running container (mandatory for production usage)"
}

PORT_APP=4000
PRODUCTION=no
CONTAINER_NAME=default

while getopts 'ha:p:n:' arg
    do
        case ${arg} in
	    h) 
			usage
			exit 0 
			;;
        a) 
			PORT_APP=${OPTARG};;
	    p)
			PRODUCTION=${OPTARG};;
	    n)
			CONTAINER_NAME=${OPTARG};;
	    \?)
			echo "Invalid option: -$OPTARG. See usage below."
			usage
			exit 1
			;;
	    :)
			echo "Option -$OPTARG requires an argument." >&2
			exit 1
			;;
        esac
done

echo Port app: $PORT_APP
echo Production: $PRODUCTION
echo Container name: $CONTAINER_NAME

if [[ $PRODUCTION == "yes"  ]]; then
	if [[ $CONTAINER_NAME == "default" ]]; then
		echo "Assigns a name to the running container for production usage!!"
		exit 1
	fi	
	docker run -it --workdir=/home/retro-board --name=$CONTAINER_NAME --expose 8080 -p $PORT_APP:8080 -d --entrypoint ./run-services-docker.sh dockercontainervm/retroboard:latest bash
	#docker exec --workdir=/home/retro-board -d $CONTAINER_NAME /bin/bash ./run-services-docker.sh
else
	if [[ $CONTAINER_NAME != "default" ]]; then
		docker run -idt --workdir=/home/retro-board --name=$CONTAINER_NAME --expose 8080 -p $PORT_APP:8080 dockercontainervm/retroboard:latest bash
	else
		docker run -idt --workdir=/home/retro-board --expose 8080 -p $PORT_APP:8080 dockercontainervm/retroboard:latest bash		
	fi
fi
