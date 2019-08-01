#!binbash

# set the APP_VERSION variable
APP_VERSION=$1

echo "USAGE: script.sh [APP_VERSION]"

# check input parameters
if [ -z "$APP_VERSION" ]; then
    echo "Error: APP_VERSION is not set"
    exit
fi

APP_VERSION="V$APP_VERSION"

# log version
echo "APP_VERSION is $APP_VERSION"

# build, tag and push
docker build -t opp-ratings-service:$APP_VERSION -t opp-ratings-service --pull --no-cache .

docker tag opp-ratings-service:$APP_VERSION giopeto/opp-ratings-service:$APP_VERSION

docker push giopeto/opp-ratings-service:$APP_VERSION