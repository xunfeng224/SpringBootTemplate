CREATE DATABASE IF NOT EXISTS `template`;
use `template`;
SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

/******************************************/
/*   数据库全名 = nacos_config   */
/*   表名称 = config_info   */
/******************************************/
CREATE TABLE `t_scene`
(
    `id`                 bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `scene_name`            varchar(255) NOT NULL COMMENT 'scene_name',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='t_scene';