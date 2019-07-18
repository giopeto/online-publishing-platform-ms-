# articles-service

## Cheatsheet

### Build, tag and push docker image

`docker build -t opp-articles-service:V1 -t opp-articles-service --pull --no-cache .`

`docker tag opp-articles-service:V1 giopeto/opp-articles-service:V1`

`docker push giopeto/opp-articles-service:V1`



`docker build -t opp-articles-service:V1 -t opp-articles-service --pull --no-cache . && docker tag opp-articles-service:V1 giopeto/opp-articles-service:V1 && docker push giopeto/opp-articles-service:V1`

OR

Linux: `./script.sh`
Windows: `sh script.sh`