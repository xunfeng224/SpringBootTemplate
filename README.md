# SpringBootTemplate
SpringBoot-3.1.5+MySQL+Redis 模板项目,用于快速启动
## 版本说明
spring-boot:3.1.5

java:17

mysql:8.0.33

redis:7.0.11
## 功能
整合MySQL、Redis
## DockerCompose快速部署MySQL,Redis
相关文件见build文件夹

1. 创建持久化存储文件

   ```shell
   mkdir -p /mydata/mysql/{conf,data,log,init}
   mkdir -p /mydata/redis/{conf,data,log}
   ```

2. 编辑my.conf,redis.conf

   MySQL密码在docker-compose.yml中设置

   Redis密码再redis.conf中设置

   ```shell
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
   ```

3. MySQL初始脚本移动至/mydata/mysql/init/目录下

4. 启动docker-compose

   ```shell
   docker-compose up -d
   ```

