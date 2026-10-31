first commit

![img.png](img.png)

scond commit
![img_1.png](img_1.png)


use maven plugin to build docker image

![img_2.png](img_2.png)

1202  mvn spring-boot:build-image
1203  mvn spring-boot:build-image
1204  docker images
1205  docker run -d \\n  --name spring-boot-app \\n  -p 8080:8080 \\n  docker.io/library/spring-boot-initial:0.0.1-SNAPSHOT
1206  docker inspect spring-boot-app
docker logs spring-boot-app | tail -n 10
docker ps -a     , check whether a container is running or not
![img_3.png](img_3.png)