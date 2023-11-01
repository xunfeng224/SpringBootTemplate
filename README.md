# SpringBootTemplate
SpringBoot-3.1.5 模板项目,用于快速启动SpringBoot+MySQL+Redis
## 版本说明
spring-boot:3.1.5

java:17

mysql:8.0.33

redis:7.0.11
## 功能
整合MySQL、Redis
## MySQL、Redis，dockerCompose快速部署
MySQL初始密码为docker-compose.yml中MYSQL_ROOT_PASSWORD
```shell
mkdir -p /mydata/mysql/{conf,data,log,init}
mkdir -p /mydata/redis/{conf,data,log}

vi /mydata/mysql/conf/my.conf
[client]
default-character-set=utf8
[mysql]
default-character-set=utf8
[mysqld]
init_connect='SET collation_connection = utf8_unicode_ci'
init_connect='SET NAMES utf8'
collation-server=utf8_unicode_ci
character-set-server=utf8
skip-character-set-client-handshake
skip-name-resolve

vi /mydata/redis/conf/redis.conf
requirepass Xf123456!

docker-compose up -d
```
## TODO
1.日志系统log4j2

2.日志切面持久化

3.二级缓存

4.webSocket

5.mysql,redis docker-compose文件,用于一键部署
