/*
Navicat MySQL Data Transfer

Source Server         : ali
Source Server Version : 50534
Source Host           : 115.28.26.203:3306
Source Database       : myproject

Target Server Type    : MYSQL
Target Server Version : 50534
File Encoding         : 65001

Date: 2014-06-02 15:59:40
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `music`
-- ----------------------------
DROP TABLE IF EXISTS `music`;
CREATE TABLE `music` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `src` varchar(50) DEFAULT NULL,
  `poster` varchar(50) DEFAULT NULL,
  `singer` varchar(50) DEFAULT NULL,
  `recoder` varchar(50) DEFAULT NULL,
  `publictime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of music
-- ----------------------------

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `newstitle` varchar(50) DEFAULT NULL,
  `newsauthor` varchar(16) DEFAULT NULL,
  `newscontent` text,
  `newsurl` varchar(100) DEFAULT NULL,
  `newsdate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) DEFAULT NULL,
  `userpassword` varchar(255) NOT NULL,
  `isadmin` char(1) DEFAULT NULL,
  `headimage` varchar(255) DEFAULT NULL COMMENT '头像',
  `sex` char(1) NOT NULL DEFAULT '0' COMMENT '''0''为女''1''为男',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `livingaddress` varchar(255) DEFAULT NULL COMMENT '现居地',
  `IDaddress` varchar(255) DEFAULT NULL COMMENT '身份证地址',
  `IDnumber` varchar(255) DEFAULT NULL COMMENT '身份证号码',
  `phoneNumber` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'df', 'sdf', null, 'sdddd', '0', 'sdfsdf', 'sdfsdf', 'dfsdf', 'sdfsdfs', null);
