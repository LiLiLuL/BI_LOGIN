/*
Navicat MySQL Data Transfer

Source Server         : connect
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : tianma_bi

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2020-08-08 17:13:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_bp_approval_case_fact`
-- ----------------------------
DROP TABLE IF EXISTS `sys_bp_approval_case_fact`;
CREATE TABLE `sys_bp_approval_case_fact` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Create_User` varchar(60) DEFAULT NULL,
  `Approval_Id` int(11) DEFAULT NULL,
  `Create_Date` datetime DEFAULT NULL,
  `User_Code` varchar(60) DEFAULT NULL,
  `User_Name` varchar(255) DEFAULT NULL,
  `Phone_Number` varchar(60) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Case_Title` varchar(255) DEFAULT NULL,
  `Case_Status` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_bp_approval_case_fact
-- ----------------------------
INSERT INTO `sys_bp_approval_case_fact` VALUES ('1', 'B189342', '1', '2019-10-19 10:23:00', null, '张三', null, 'xiaoqing_chen@tianma.cn', '张三的菜单申请流程', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('2', 'B189342', '1', '2019-10-19 10:29:00', null, '里斯', null, 'xiaoqing_chen@tianma.cn', '里斯的菜单申请流程', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('3', 'B189343', '1', '2019-10-19 10:29:00', null, '里斯', null, 'xiaoqing_chen@tianma.cn', '里斯的菜单申请流程', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('4', 'B189343', '1', '2019-10-19 10:29:00', null, '里斯', null, 'xiaoqing_chen@tianma.cn', '里斯的菜单申请流程', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('5', 'B189343', '1', '2019-10-19 10:29:00', null, '里斯', null, 'xiaoqing_chen@tianma.cn', '里斯的菜单申请流程', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('6', 'B179803', '4', '2019-12-13 14:50:00', null, '晨晨', null, '2733071538@qq.com', '晨晨的4', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('7', 'B786543', '4', '2019-12-28 14:49:07', null, '成成', null, '2733071538@qq.com', '成成的4', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('11', 'B134256', '4', '2019-12-29 14:49:55', null, '小小', null, '2733071538@qq.com', '小小的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('12', 'B897654', '4', '2019-12-30 18:58:10', null, '成成', null, 'xiaoqing_chen@tianma.cn', '成成的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('13', 'D189452', '4', '2020-01-17 18:28:42', null, '小熊啊', null, '13456789@qq.com', '小熊啊的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('14', 'K098765', '4', '2020-01-17 18:40:38', null, 'Cxq', null, '2733071538@qq.com', 'Cxq的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('15', 'B786905', '4', '2020-03-19 09:16:42', null, 'chenchen', null, 'xiaoqing_chen@tianma.cn', 'chenchen的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('16', 'A12345', '4', '2020-03-20 15:41:45', null, 'cxq', null, '2733071538@qq.com', 'cxq的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('17', 'b5678', '4', '2020-03-23 14:20:57', null, 'BXC', null, '2733071538@qq.com', 'BXC的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('18', 'a987654332', '4', '2020-03-23 14:22:08', null, '12343', null, '2733071538@qq.com', '12343的用户申请注册', '2');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('19', 'B190056', '4', '2020-03-23 14:26:04', null, 'xiaoiqng', null, 'xiaoqing_chen@tianma.cn', 'xiaoiqng的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('20', 'B189345', '4', '2020-03-23 15:39:47', null, '陈小青', null, 'xiaoqing_chen@tianma.cn', '陈小青的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('21', 'B89765', '4', '2020-03-23 17:06:22', null, 'Test', null, '2733071538@qq.com', 'Test的用户申请注册', '2');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('22', 'BFG', '4', '2020-03-23 20:08:33', null, 'CXS', null, 'xiaoqing_chen@tianma.cn', 'CXS的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('23', 'B1901421', '4', '2020-03-25 10:12:11', null, 'HZP', null, '2733071538@qq.com', 'HZP的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('24', 'B178234', '4', '2020-04-03 17:22:19', null, '不不不', null, '2733071538@qq.com', '不不不的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('25', 'A099037', '4', '2020-04-13 13:46:03', null, '郭曼', null, 'man_guo2@tianma.cn', '郭曼的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('26', 'B189343', '4', '2020-04-16 10:04:37', null, 'chenchen', null, 'xiaoqing_chen@tianma.cn', 'chenchen的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('27', '11111', '4', '2020-04-18 16:03:07', null, '顶顶顶顶', null, '2733071538@qq.com', '顶顶顶顶的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('28', '1111122', '4', '2020-04-18 16:05:41', null, '顶顶顶顶', null, '2733071538@qq.com', '顶顶顶顶的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('29', 'B12345', '4', '2020-04-18 16:10:06', null, 'CDCD', null, '2733071538@qq.com', 'CDCD的用户申请注册', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('30', 'B1893451', '4', '2019-10-19 10:29:00', null, '里斯', null, 'xiaoqing_chen@tianma.cn', '里斯的菜单申请流程', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('31', 'B1893458', '4', '2019-10-19 10:29:00', null, '里斯', null, 'xiaoqing_chen@tianma.cn', '里斯的菜单申请流程', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('32', 'B18934580', '4', '2019-10-19 10:29:00', null, '里斯', null, 'xiaoqing_chen@tianma.cn', '里斯的菜单申请流程', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('33', 'B1894580', '4', '2019-10-19 10:29:00', null, '里斯', null, 'xiaoqing_chen@tianma.cn', '里斯的菜单申请流程', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('34', 'B18945580', '4', '2019-10-19 10:29:00', null, '里斯', null, 'xiaoqing_chen@tianma.cn', '里斯的菜单申请流程', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('35', 'B18910', '4', '2019-10-19 10:29:00', null, '里斯', null, 'xiaoqing_chen@tianma.cn', '里斯的菜单申请流程', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('36', 'B189105', '4', '2019-10-19 10:29:00', null, '里斯', null, 'xiaoqing_chen@tianma.cn', '里斯的菜单申请流程', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('37', 'B786543', '6', '2020-04-20 15:44:40', null, 'cxqq', null, 'xiaoqing_chen@tianma.cn', 'cxqq的用户申请注册（带审批节点）', '0');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('38', 'B18978543', '6', '2020-04-22 10:29:00', null, '里斯', null, 'xiaoqing_chen@tianma.cn', '里斯的菜单申请流程', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('39', '123', '6', '2020-04-22 16:22:54', null, '3456', null, '2733071538@qq.com', '3456的用户申请注册（带审批节点）', '0');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('40', 'B123456', '6', '2020-04-23 10:21:58', null, 'gggg', null, '2733071538@qq.com', 'gggg的用户申请注册（带审批节点）', '2');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('41', '1234555', '6', '2020-04-23 10:36:36', null, '4555555', null, '2733071538@qq.com', '4555555的用户申请注册（带审批节点）', '0');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('42', '1221434', '6', '2020-04-23 10:59:47', null, '4535', null, '2733071538@qq.com', '4535的用户申请注册（带审批节点）', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('43', 'B1234567', '6', '2020-04-23 11:18:42', null, 'dfd', null, '2733071538@qq.com', 'dfd的用户申请注册（带审批节点）', '1');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('44', '789654FG', '6', '2020-04-23 11:25:56', null, 'TEST', null, '2733071538@qq.com', 'TEST的用户申请注册（带审批节点）', '0');
INSERT INTO `sys_bp_approval_case_fact` VALUES ('45', 'wer4ewtr', '6', '2020-04-23 17:49:52', null, '232143', null, '2733071538@qq.com', '232143的用户申请注册（带审批节点）', '1');

-- ----------------------------
-- Table structure for `sys_bp_approval_case_record_fact`
-- ----------------------------
DROP TABLE IF EXISTS `sys_bp_approval_case_record_fact`;
CREATE TABLE `sys_bp_approval_case_record_fact` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `modify_user` varchar(60) DEFAULT NULL,
  `create_user` varchar(60) DEFAULT NULL,
  `Create_Date` datetime DEFAULT NULL,
  `Record_Date` datetime DEFAULT NULL,
  `Case_Id` int(11) DEFAULT NULL,
  `Currenty_Node_Id` int(11) DEFAULT NULL,
  `opration_user` int(11) DEFAULT NULL,
  `opration_result` int(11) DEFAULT NULL,
  `opration_reason` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_bp_approval_case_record_fact
-- ----------------------------
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('1', null, 'B189342', '2019-10-19 10:23:00', null, '1', '1', '1', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('2', null, 'B189342', '2019-10-19 10:29:00', null, '2', '1', '1', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('3', null, 'B189343', '2019-10-19 10:29:00', null, '3', '1', '1', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('4', null, 'B189343', '2019-10-19 10:29:00', null, '4', '1', '1', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('5', null, 'B189343', '2019-10-19 10:29:00', null, '5', '1', '1', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('6', null, 'B179803', '2019-12-13 14:49:33', null, '6', '14', '1', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('7', null, 'B786543', '2019-12-28 14:49:07', null, '7', '14', '1', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('8', null, 'B134256', '2019-12-29 14:49:55', null, '11', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('9', null, 'B897654', '2019-12-30 18:58:10', null, '12', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('10', 'B190024', 'B134256', '2019-12-29 14:49:55', '2020-01-17 18:19:39', '11', '14', '1', '1', '44');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('11', 'B190024', 'B897654', '2019-12-30 18:58:10', '2020-01-17 18:26:36', '12', '14', '1', '1', '注册账号信息');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('12', null, 'D189452', '2020-01-17 18:28:42', null, '13', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('13', 'B190024', 'D189452', '2020-01-17 18:28:42', '2020-01-17 18:28:58', '13', '14', '1', '1', 'tongyi');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('14', null, 'K098765', '2020-01-17 18:40:38', null, '14', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('15', null, 'B786905', '2020-03-19 09:16:42', null, '15', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('16', 'B190024', 'B786905', '2020-03-19 09:16:42', '2020-03-19 09:35:10', '15', '14', '1', '1', '');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('17', null, 'A12345', '2020-03-20 15:41:45', null, '16', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('18', null, 'b5678', '2020-03-23 14:20:57', null, '17', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('19', null, 'a987654332', '2020-03-23 14:22:08', null, '18', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('20', null, 'B190056', '2020-03-23 14:26:04', null, '19', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('21', null, 'B189345', '2020-03-23 15:39:47', null, '20', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('22', 'B190024', 'B189345', '2020-03-23 15:39:47', '2020-03-23 15:41:09', '20', '14', '1', '1', '');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('23', 'B190024', 'B190056', '2020-03-23 14:26:04', '2020-03-23 15:41:27', '19', '14', '1', '0', '');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('24', 'B190024', 'K098765', '2020-01-17 18:40:38', '2020-03-23 15:49:00', '14', '14', '1', '1', '123');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('25', null, 'B89765', '2020-03-23 17:06:22', null, '21', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('26', null, 'BFG', '2020-03-23 20:08:33', null, '22', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('27', null, 'B1901421', '2020-03-25 10:12:11', null, '23', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('28', 'B190024', 'B1901421', '2020-03-25 10:12:11', '2020-03-25 10:15:09', '23', '14', '1', '1', '');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('29', null, 'B178234', '2020-04-03 17:22:19', null, '24', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('30', 'B190024', 'B178234', '2020-04-03 17:22:19', '2020-04-03 17:23:11', '24', '14', '1', '1', '');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('31', 'B190024', 'A12345', '2020-03-20 15:41:45', '2020-04-03 17:24:33', '16', '14', '1', '1', '');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('32', null, 'A099037', '2020-04-13 13:46:03', null, '25', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('33', 'B190024', 'A099037', '2020-04-13 13:46:03', '2020-04-13 14:08:24', '25', '14', '1', '1', '');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('34', null, 'B189343', '2020-04-16 10:04:37', null, '26', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('35', null, '11111', '2020-04-18 16:03:07', null, '27', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('36', null, '1111122', '2020-04-18 16:05:41', null, '28', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('37', null, 'B12345', '2020-04-18 16:10:06', null, '29', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('38', null, 'B1893451', '2019-10-19 10:29:00', null, '30', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('39', null, 'B1893458', '2019-10-19 10:29:00', null, '31', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('40', null, 'B18934580', '2019-10-19 10:29:00', null, '32', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('41', null, 'B1894580', '2019-10-19 10:29:00', null, '33', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('42', null, 'B18945580', '2019-10-19 10:29:00', null, '34', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('43', null, 'B18910', '2019-10-19 10:29:00', null, '35', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('44', null, 'B189105', '2019-10-19 10:29:00', null, '36', '14', '39', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('45', null, 'B786543', '2020-04-20 15:44:40', null, '37', '19', '38', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('46', 'B189342', 'B189342', '2020-04-21 10:48:29', '2020-04-21 10:48:29', '37', '20', '39', '1', '通过呀');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('47', 'B190024', 'b5678', '2020-03-23 14:20:57', '2020-04-21 10:49:53', '17', '14', '1', '1', '');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('48', 'B190024', 'B1893458', '2019-10-19 10:29:00', '2020-04-21 10:50:00', '31', '14', '1', '1', '');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('49', null, 'B18978543', '2020-04-22 10:29:00', null, '38', '18', '38', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('50', null, 'B189342', '2020-04-22 15:46:27', null, '38', '19', '39', '1', '45768');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('51', null, '123', '2020-04-22 16:22:54', null, '39', '18', '38', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('52', null, 'B189342', '2020-04-22 16:23:42', null, '39', '19', '39', '1', '');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('53', null, 'B190024', '2020-04-23 10:06:12', null, '37', '0', '1', '0', '拒绝测试');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('54', null, 'B190024', '2020-04-23 10:15:22', null, '39', '20', '1', '1', '123');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('55', null, 'B123456', '2020-04-23 10:21:58', null, '40', '18', '38', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('56', null, 'B189342', '2020-04-23 10:22:57', null, '40', '19', '39', '1', 'rrrr');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('57', null, '1234555', '2020-04-23 10:36:36', null, '41', '18', '38', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('58', null, 'B189342', '2020-04-23 10:51:19', null, '41', '19', '39', '1', '222222');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('59', null, '1221434', '2020-04-23 10:59:47', null, '42', '18', '38', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('60', null, 'B189342', '2020-04-23 11:00:43', null, '42', '19', '39', '1', '12344');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('61', null, 'B190024', '2020-04-23 11:15:03', null, '42', '20', '1', '1', '12344');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('62', null, 'B190024', '2020-04-23 11:17:22', null, '40', '18', '1', '2', '12334');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('63', null, 'B1234567', '2020-04-23 11:18:42', null, '43', '18', '38', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('64', null, 'B189342', '2020-04-23 11:20:35', null, '43', '19', '39', '1', '132243');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('65', null, 'B190024', '2020-04-23 11:21:09', null, '43', '20', '1', '1', '1321');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('66', null, '789654FG', '2020-04-23 11:25:56', null, '44', '18', '38', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('67', null, 'B189342', '2020-04-23 11:26:41', null, '44', '19', '39', '1', '');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('68', null, 'wer4ewtr', '2020-04-23 17:49:52', null, '45', '18', '38', null, null);
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('69', null, 'B189342', '2020-04-23 18:07:15', null, '45', '19', '39', '1', '1234343');
INSERT INTO `sys_bp_approval_case_record_fact` VALUES ('70', null, 'B190024', '2020-04-23 18:09:43', null, '45', '20', '1', '1', '');

-- ----------------------------
-- Table structure for `sys_bp_approval_dim`
-- ----------------------------
DROP TABLE IF EXISTS `sys_bp_approval_dim`;
CREATE TABLE `sys_bp_approval_dim` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Approval_Name` varchar(255) DEFAULT NULL,
  `Create_User` varchar(60) DEFAULT NULL,
  `modify_user` varchar(60) DEFAULT NULL,
  `Create_Date` datetime DEFAULT NULL,
  `Record_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_bp_approval_dim
-- ----------------------------
INSERT INTO `sys_bp_approval_dim` VALUES ('1', '工单审批6', 'B189342', null, null, null);
INSERT INTO `sys_bp_approval_dim` VALUES ('2', '工单审批5', 'B678342', null, null, null);
INSERT INTO `sys_bp_approval_dim` VALUES ('3', '工单审批8', 'B189342', null, null, null);
INSERT INTO `sys_bp_approval_dim` VALUES ('4', '用户申请注册', 'B189342', null, null, null);
INSERT INTO `sys_bp_approval_dim` VALUES ('5', '用户申请菜单权限流程', 'B190024', null, null, null);
INSERT INTO `sys_bp_approval_dim` VALUES ('6', '用户申请注册（带审批节点）', 'B190024', null, null, null);
INSERT INTO `sys_bp_approval_dim` VALUES ('7', 'fgfgfg', 'B189342', null, null, null);

-- ----------------------------
-- Table structure for `sys_bp_approval_node_dim`
-- ----------------------------
DROP TABLE IF EXISTS `sys_bp_approval_node_dim`;
CREATE TABLE `sys_bp_approval_node_dim` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Approval_Id` int(11) DEFAULT NULL,
  `Modify_User` varchar(60) DEFAULT NULL,
  `Create_User` varchar(60) DEFAULT NULL,
  `Create_Date` datetime DEFAULT NULL,
  `Record_Date` datetime DEFAULT NULL,
  `Node_Type` int(11) DEFAULT NULL,
  `Conditions` varchar(255) DEFAULT NULL,
  `Prev_Node` int(11) DEFAULT NULL,
  `Next_Node` int(11) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Oper_Sign` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_bp_approval_node_dim
-- ----------------------------
INSERT INTO `sys_bp_approval_node_dim` VALUES ('1', '1', null, null, null, null, null, null, '0', '2', '创建3', null);
INSERT INTO `sys_bp_approval_node_dim` VALUES ('2', '1', null, null, null, null, null, null, '1', '3', '审批3', null);
INSERT INTO `sys_bp_approval_node_dim` VALUES ('3', '1', null, null, null, null, null, null, '2', '4', '审批4', null);
INSERT INTO `sys_bp_approval_node_dim` VALUES ('4', '1', null, null, null, null, null, null, '3', '0', '结束3', null);
INSERT INTO `sys_bp_approval_node_dim` VALUES ('5', '2', null, null, null, null, null, null, '0', '6', '创建4', null);
INSERT INTO `sys_bp_approval_node_dim` VALUES ('6', '2', null, null, null, null, null, null, '5', '7', '审批4', null);
INSERT INTO `sys_bp_approval_node_dim` VALUES ('7', '2', null, null, null, null, null, null, '6', '8', '审批5', null);
INSERT INTO `sys_bp_approval_node_dim` VALUES ('8', '2', null, null, null, null, null, null, '7', '0', '结束4', null);
INSERT INTO `sys_bp_approval_node_dim` VALUES ('9', '3', null, null, null, null, null, null, '0', '10', '创建3', null);
INSERT INTO `sys_bp_approval_node_dim` VALUES ('10', '3', null, null, null, null, null, null, '9', '11', '审批3', null);
INSERT INTO `sys_bp_approval_node_dim` VALUES ('11', '3', null, null, null, null, null, null, '10', '12', '审批4', null);
INSERT INTO `sys_bp_approval_node_dim` VALUES ('12', '3', null, null, null, null, null, null, '11', '0', '结束3', null);
INSERT INTO `sys_bp_approval_node_dim` VALUES ('13', '4', null, null, null, null, null, null, '0', '14', '用户创建', '0');
INSERT INTO `sys_bp_approval_node_dim` VALUES ('14', '4', null, null, null, null, null, null, '13', '0', '管理员审批', 'B190024');
INSERT INTO `sys_bp_approval_node_dim` VALUES ('15', '5', null, null, null, null, null, null, '0', '16', '新建', '0');
INSERT INTO `sys_bp_approval_node_dim` VALUES ('16', '5', null, null, null, null, null, null, '15', '17', '审批', 'B190024');
INSERT INTO `sys_bp_approval_node_dim` VALUES ('17', '5', null, null, null, null, null, null, '16', '0', '审批确认', 'B189342');
INSERT INTO `sys_bp_approval_node_dim` VALUES ('18', '6', null, null, null, null, null, null, '0', '19', '创建', '0');
INSERT INTO `sys_bp_approval_node_dim` VALUES ('19', '6', null, null, null, null, null, null, '18', '20', '工单审批', 'user1');
INSERT INTO `sys_bp_approval_node_dim` VALUES ('20', '6', null, null, null, null, null, null, '19', '0', '管理员审批', 'user2');
INSERT INTO `sys_bp_approval_node_dim` VALUES ('21', '7', null, null, null, null, null, null, '0', '22', '创建', '0');
INSERT INTO `sys_bp_approval_node_dim` VALUES ('22', '7', null, null, null, null, null, null, '21', '23', '审批节点1', 'user0');
INSERT INTO `sys_bp_approval_node_dim` VALUES ('23', '7', null, null, null, null, null, null, '22', '24', '审批节点2', 'user1');
INSERT INTO `sys_bp_approval_node_dim` VALUES ('24', '7', null, null, null, null, null, null, '23', '25', '审批节点3', 'user2');
INSERT INTO `sys_bp_approval_node_dim` VALUES ('25', '7', null, null, null, null, null, null, '24', '0', '结束', '1');

-- ----------------------------
-- Table structure for `sys_bp_category_admin_dim`
-- ----------------------------
DROP TABLE IF EXISTS `sys_bp_category_admin_dim`;
CREATE TABLE `sys_bp_category_admin_dim` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Category_Code` varchar(60) NOT NULL COMMENT '类别编码',
  `Parameter_Code` varchar(60) NOT NULL COMMENT '类型参数编码',
  `Admin_Code` varchar(60) NOT NULL COMMENT '管理员编码',
  `Create_User` varchar(60) NOT NULL COMMENT '创建人',
  `Create_Date` datetime NOT NULL COMMENT '创建时间',
  `Invalid_Flag` tinyint(1) DEFAULT NULL COMMENT '作废标识',
  `Oper_Sign` varchar(60) DEFAULT NULL COMMENT '更新人',
  `Record_Date` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_bp_category_admin_dim
-- ----------------------------
INSERT INTO `sys_bp_category_admin_dim` VALUES ('1', '10009', 'W710023', 'B189342', 'B189342', '2020-04-17 20:00:03', '1', 'B190024', '2020-04-27 15:08:52');
INSERT INTO `sys_bp_category_admin_dim` VALUES ('2', '10002', 'W710023', 'B189342', 'B189342', '2020-04-17 20:00:03', '0', 'B190024', '2020-04-27 15:08:52');
INSERT INTO `sys_bp_category_admin_dim` VALUES ('3', '10002', 'WD1002', 'B189342', 'B189342', '2020-04-17 20:00:03', '1', null, null);
INSERT INTO `sys_bp_category_admin_dim` VALUES ('4', '10002', 'WD1002', 'B190024', 'B189342', '2020-04-17 20:00:03', '1', 'B189343', '2020-04-17 20:00:03');
INSERT INTO `sys_bp_category_admin_dim` VALUES ('5', 'AD10001', 'user1', 'B189342', 'B189342', '2020-04-17 20:00:03', '1', null, null);
INSERT INTO `sys_bp_category_admin_dim` VALUES ('6', 'AD10001', 'user2', 'B190024', 'B189342', '2020-04-17 20:00:03', '1', null, null);
INSERT INTO `sys_bp_category_admin_dim` VALUES ('7', 'AD10001', 'user0', 'B1901421', 'B1901421', '2020-04-17 20:00:03', '1', null, null);
INSERT INTO `sys_bp_category_admin_dim` VALUES ('8', 'AD10001', 'user0', '', 'B1901421', '2020-04-17 20:00:03', '0', null, null);
INSERT INTO `sys_bp_category_admin_dim` VALUES ('9', 'TEST_Cate1', 'test001', 'B189342', 'B190024', '2020-04-24 17:20:48', '1', null, null);
INSERT INTO `sys_bp_category_admin_dim` VALUES ('10', 'TEST_Cate1', 'test002', 'B190024', 'B190024', '2020-04-24 17:21:42', '1', null, null);
INSERT INTO `sys_bp_category_admin_dim` VALUES ('13', '10002', '10002', 'B190056', 'B189342', '2020-05-07 16:27:55', '0', 'B189342', '2020-05-08 11:44:17');
INSERT INTO `sys_bp_category_admin_dim` VALUES ('15', 'TEST_Cate1', 'test001', 'B190056', 'B190024', '2020-04-24 17:22:54', '0', 'B189342', '2020-05-08 11:44:17');
INSERT INTO `sys_bp_category_admin_dim` VALUES ('17', 'AD10001', 'user0', 'B190056', 'B189342', '2020-05-07 16:41:38', '0', 'B189342', '2020-05-08 11:44:17');
INSERT INTO `sys_bp_category_admin_dim` VALUES ('18', 'AD10001', 'user2', 'B190056', 'B189342', '2020-05-08 11:42:22', '0', 'B189342', '2020-05-08 11:44:17');
INSERT INTO `sys_bp_category_admin_dim` VALUES ('19', '10002', 'WD1002', 'B190056', 'B189342', '2020-05-08 11:44:17', '1', null, null);
INSERT INTO `sys_bp_category_admin_dim` VALUES ('20', '10002', '10003', 'B190056', 'B189342', '2020-05-08 11:44:48', '1', null, null);

-- ----------------------------
-- Table structure for `sys_bp_category_dim`
-- ----------------------------
DROP TABLE IF EXISTS `sys_bp_category_dim`;
CREATE TABLE `sys_bp_category_dim` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Category_Code` varchar(60) NOT NULL COMMENT '类别编码',
  `Category_Name` varchar(60) NOT NULL COMMENT '类别名称',
  `Create_User` varchar(60) NOT NULL COMMENT '创建人',
  `Create_Date` datetime NOT NULL COMMENT '创建时间',
  `Invalid_Flag` tinyint(1) DEFAULT NULL COMMENT '作废标识',
  `Oper_Sign` varchar(60) DEFAULT NULL COMMENT '更新人',
  `Record_Date` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_bp_category_dim
-- ----------------------------
INSERT INTO `sys_bp_category_dim` VALUES ('1', '10009', '维度类型3', 'B189342', '2020-04-16 20:00:03', '1', 'B190024', '2020-04-27 14:26:24');
INSERT INTO `sys_bp_category_dim` VALUES ('2', '10002', '维度类型39087', 'B189342', '2020-04-16 20:00:03', '1', null, null);
INSERT INTO `sys_bp_category_dim` VALUES ('3', '10003', '维度类型2', 'B189342', '2020-04-16 20:00:03', '1', null, null);
INSERT INTO `sys_bp_category_dim` VALUES ('4', 'AD10001', '用户权限', 'B189342', '2020-04-16 20:00:03', '1', null, null);
INSERT INTO `sys_bp_category_dim` VALUES ('5', 'TEST_Cate1', '分类测试1', 'B190024', '2020-04-24 14:58:10', '1', null, null);

-- ----------------------------
-- Table structure for `sys_bp_category_info`
-- ----------------------------
DROP TABLE IF EXISTS `sys_bp_category_info`;
CREATE TABLE `sys_bp_category_info` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Parameter_Code` varchar(60) NOT NULL COMMENT '类型参数编码',
  `Parameter_Name` varchar(60) NOT NULL COMMENT '类型参数名称',
  `Parameter_Description` varchar(255) NOT NULL COMMENT '类型参数说明',
  `Create_User` varchar(60) NOT NULL COMMENT '创建人',
  `Create_Date` datetime NOT NULL COMMENT '创建时间',
  `Invalid_Flag` tinyint(1) DEFAULT NULL COMMENT '作废标识',
  `Oper_Sign` varchar(60) DEFAULT NULL COMMENT '更新人',
  `Record_Date` datetime DEFAULT NULL COMMENT '更新时间',
  `Category_Code` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_bp_category_info
-- ----------------------------
INSERT INTO `sys_bp_category_info` VALUES ('1', '10002', '维度类型明细表', '维度类型明细表说明', 'B189342', '2020-04-17 20:00:03', '1', null, null, '10002');
INSERT INTO `sys_bp_category_info` VALUES ('2', '10003', '维度类型明细表2', '维度类型明细表说明2', 'B189342', '2020-04-17 20:00:03', '1', null, null, '10002');
INSERT INTO `sys_bp_category_info` VALUES ('3', 'WD1002', '维度类型明细表3', '维度类型明细表说明3', 'B189342', '2020-04-17 20:00:03', '1', null, null, '10002');
INSERT INTO `sys_bp_category_info` VALUES ('4', 'W710023', '维度类型明细表3更新1', '维度类型明细表说明3更新', 'B189342', '2020-04-17 20:00:03', '1', 'B190024', '2020-04-27 15:08:52', '10003');
INSERT INTO `sys_bp_category_info` VALUES ('5', 'user0', '普通用户', '普通用户无任何权限，仅可注册', 'B189342', '2020-04-17 20:00:03', '1', null, null, 'AD10001');
INSERT INTO `sys_bp_category_info` VALUES ('6', 'user1', '审批用户', '审批用户可以审批', 'B189342', '2020-04-17 20:00:03', '1', null, null, 'AD10001');
INSERT INTO `sys_bp_category_info` VALUES ('7', 'user2', '系统管理员', '有所有权限', 'B189342', '2020-04-17 20:00:03', '1', null, null, 'AD10001');
INSERT INTO `sys_bp_category_info` VALUES ('8', 'test001', '测试', '测试属性创建', 'B190024', '2020-04-24 15:58:00', '1', null, null, 'TEST_Cate1');
INSERT INTO `sys_bp_category_info` VALUES ('9', 'test002', '测试2', '测试2属性', 'B190024', '2020-04-24 17:03:16', '1', null, null, 'TEST_Cate1');

-- ----------------------------
-- Table structure for `sys_bp_menu_admin_dim`
-- ----------------------------
DROP TABLE IF EXISTS `sys_bp_menu_admin_dim`;
CREATE TABLE `sys_bp_menu_admin_dim` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Type_Flag` int(11) DEFAULT NULL,
  `Menu_Code` varchar(60) DEFAULT NULL,
  `Admin_Code` varchar(60) DEFAULT NULL,
  `Invalid_Flag` tinyint(1) DEFAULT NULL,
  `Oper_Sign` varchar(60) DEFAULT NULL,
  `Record_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_bp_menu_admin_dim
-- ----------------------------
INSERT INTO `sys_bp_menu_admin_dim` VALUES ('1', null, '14', null, null, null, null);

-- ----------------------------
-- Table structure for `sys_bp_menu_dim`
-- ----------------------------
DROP TABLE IF EXISTS `sys_bp_menu_dim`;
CREATE TABLE `sys_bp_menu_dim` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Type_Flag` int(11) DEFAULT NULL,
  `Menu_Code` varchar(60) DEFAULT NULL,
  `Menu_Name` varchar(60) DEFAULT NULL,
  `Parent_Menu_Code` varchar(60) DEFAULT NULL,
  `Invalid_Flag` tinyint(1) DEFAULT NULL,
  `Oper_Sign` varchar(60) DEFAULT NULL,
  `Record_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_bp_menu_dim
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_bp_org_admin_dim`
-- ----------------------------
DROP TABLE IF EXISTS `sys_bp_org_admin_dim`;
CREATE TABLE `sys_bp_org_admin_dim` (
  `Id` int(11) NOT NULL,
  `Type_Flag` int(11) DEFAULT NULL,
  `Org_Code` varchar(60) DEFAULT NULL,
  `Admin_Code` varchar(60) DEFAULT NULL,
  `Invalid_Flag` tinyint(1) DEFAULT NULL,
  `Oper_Sign` varchar(60) DEFAULT NULL,
  `Create_Date` datetime DEFAULT NULL,
  `Record_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_bp_org_admin_dim
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_bp_org_dim`
-- ----------------------------
DROP TABLE IF EXISTS `sys_bp_org_dim`;
CREATE TABLE `sys_bp_org_dim` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Type_Flag` int(11) DEFAULT NULL,
  `Org_Code` varchar(60) DEFAULT NULL,
  `Org_Name` varchar(255) DEFAULT NULL,
  `Parent_Department` varchar(60) DEFAULT NULL,
  `Level_Flag` varchar(255) DEFAULT NULL,
  `Invalid_Flag` tinyint(1) DEFAULT NULL,
  `modify_user` varchar(60) DEFAULT NULL,
  `create_user` varchar(60) DEFAULT NULL,
  `Create_Date` datetime DEFAULT NULL,
  `Record_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Id_UNIQUE` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_bp_org_dim
-- ----------------------------
INSERT INTO `sys_bp_org_dim` VALUES ('1', '0', 'TM77a', '上海77a', '0', '0', '1', '0', '1', '2019-09-18 16:05:00', null);
INSERT INTO `sys_bp_org_dim` VALUES ('2', '0', 'TM77', '上海77', '0', '0.1', '1', '0', '1', '2019-09-18 16:05:00', null);
INSERT INTO `sys_bp_org_dim` VALUES ('3', '0', 'TM7712', '上海7712', '2', '0.1', '1', '0', '1', '2019-09-29 16:05:00', null);
INSERT INTO `sys_bp_org_dim` VALUES ('4', '0', 'TM77123', '上海77123', '3', '0.1.3', '0', '0', '1', '2019-09-29 16:06:00', null);
INSERT INTO `sys_bp_org_dim` VALUES ('5', '0', 'TM778', '上海88', '0', '0', '1', '0', '1', '2019-09-29 16:06:00', null);
INSERT INTO `sys_bp_org_dim` VALUES ('6', '0', 'TM798', '上海898', '5', '0.5', '1', '0', '1', '2019-09-29 16:06:00', null);
INSERT INTO `sys_bp_org_dim` VALUES ('7', '0', 'TM8', '上98', '5', '0.5', '1', '0', '1', '2019-09-29 16:06:00', null);
INSERT INTO `sys_bp_org_dim` VALUES ('8', '1', '88', '0001', '2', '0.1.2', '0', null, null, null, '2019-10-09 17:05:54');
INSERT INTO `sys_bp_org_dim` VALUES ('9', null, '3333', 'jk沙漠韩国', '1', '0.1', '1', null, null, '2019-09-30 17:13:10', null);
INSERT INTO `sys_bp_org_dim` VALUES ('10', '2', '555', 'OLED', '1', '0.1', '1', null, null, '2019-09-30 17:21:28', null);
INSERT INTO `sys_bp_org_dim` VALUES ('11', '1', '55555', '的人天翻地覆的官方放出', '5', '0.5', '1', null, null, null, '2020-04-03 17:02:00');
INSERT INTO `sys_bp_org_dim` VALUES ('12', '1', 'TM567', 'OLLEDD', '5', '0.5', '0', null, null, '2019-10-09 15:19:36', null);
INSERT INTO `sys_bp_org_dim` VALUES ('13', '1', '666', '上海8890', '7', '0.5.7', '1', null, null, null, '2019-12-18 15:41:11');
INSERT INTO `sys_bp_org_dim` VALUES ('14', '2', '8989', '上海789', '6', '0.5.6', '1', null, null, '2019-12-18 15:41:45', null);

-- ----------------------------
-- Table structure for `sys_bp_user_dim`
-- ----------------------------
DROP TABLE IF EXISTS `sys_bp_user_dim`;
CREATE TABLE `sys_bp_user_dim` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `User_Code` varchar(60) DEFAULT NULL,
  `User_Name` varchar(255) DEFAULT NULL,
  `User_Password` varchar(60) DEFAULT NULL,
  `Dept` varchar(60) DEFAULT NULL,
  `Phone_Number` varchar(60) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Invalid_Flag` tinyint(1) DEFAULT NULL,
  `Oper_Sign` varchar(60) DEFAULT NULL,
  `Create_Date` datetime DEFAULT NULL,
  `Record_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `User_Code_UNIQUE` (`User_Code`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_bp_user_dim
-- ----------------------------
INSERT INTO `sys_bp_user_dim` VALUES ('1', '11', '212', '1', '212', '12', '12', '0', '121', '2019-09-01 12:12:00', '2019-09-01 12:12:00');
INSERT INTO `sys_bp_user_dim` VALUES ('27', '13', null, null, 'test', null, null, '1', null, null, null);
INSERT INTO `sys_bp_user_dim` VALUES ('29', 'Bjkh', 'sdfs', 'fdgf', 'dfgd', '', '13654044126@qq.com', '1', null, '2019-09-23 11:39:10', null);
INSERT INTO `sys_bp_user_dim` VALUES ('31', '12', null, '48e5d94a9446eb156b893787f1df0716', '', null, null, '0', null, null, null);
INSERT INTO `sys_bp_user_dim` VALUES ('32', '', '', 'd41d8cd98f00b204e9800998ecf8427e', '', '', '', '1', null, '2019-09-25 10:39:34', null);
INSERT INTO `sys_bp_user_dim` VALUES ('35', 'JHJH', '454T', '48e5d94a9446eb156b893787f1df0716', 'dsf', '', '32q213132', '1', null, '2019-09-25 14:12:13', null);
INSERT INTO `sys_bp_user_dim` VALUES ('36', 'sds', 'sdsafd', '48e5d94a9446eb156b893787f1df0716', 'dsfesr', '15754310652', '1354044126@qq.com', '1', null, '2019-09-25 14:41:07', null);
INSERT INTO `sys_bp_user_dim` VALUES ('37', 'B456123', 'cxs', '48e5d94a9446eb156b893787f1df0716', 'dep', '15754333333', '1354044126@qq.com', '0', null, '2019-09-25 16:45:28', null);
INSERT INTO `sys_bp_user_dim` VALUES ('38', 'B189342', 'cxq', '9c1ae194a42da070c95ce353b46acbc6', 'IT', '15754310754', '2733071538@qq.com', '1', null, '2019-12-17 13:59:19', null);
INSERT INTO `sys_bp_user_dim` VALUES ('39', 'B190024', '管理员', '9c1ae194a42da070c95ce353b46acbc6', 'IT', '15754318907', '2733071538@qq.com', '1', null, '2019-12-28 12:07:44', null);
INSERT INTO `sys_bp_user_dim` VALUES ('40', 'B134256', '小小', '9c1ae194a42da070c95ce353b46acbc6', '运营', '15754310652', null, '0', null, '2020-01-17 18:19:39', null);
INSERT INTO `sys_bp_user_dim` VALUES ('41', 'B897654', '成成', '9c1ae194a42da070c95ce353b46acbc6', 'IT', '15754310642', null, '0', null, '2020-01-17 18:26:36', null);
INSERT INTO `sys_bp_user_dim` VALUES ('42', 'D189452', '小熊啊', '9c1ae194a42da070c95ce353b46acbc6', '部门1', '15754310652', '13456789@qq.com', '0', null, '2020-01-17 18:28:58', null);
INSERT INTO `sys_bp_user_dim` VALUES ('43', 'B786905', 'chenchen', '9c1ae194a42da070c95ce353b46acbc6', 'IT', '', 'xiaoqing_chen@tianma.cn', '0', null, '2020-03-19 09:35:10', null);
INSERT INTO `sys_bp_user_dim` VALUES ('44', 'B189345', '陈小青', '9c1ae194a42da070c95ce353b46acbc6', '1WE', '15754310653', 'xiaoqing_chen@tianma.cn', '0', null, '2020-03-23 15:41:09', null);
INSERT INTO `sys_bp_user_dim` VALUES ('45', 'B190056', 'xiaoiqng', '9c1ae194a42da070c95ce353b46acbc6', 'IT', '15754310653', 'xiaoqing_chen@tianma.cn', '1', null, '2020-03-23 15:41:27', null);
INSERT INTO `sys_bp_user_dim` VALUES ('46', 'K098765', 'Cxq', '9c1ae194a42da070c95ce353b46acbc6', 'CC', '18989765432', '2733071538@qq.com', '0', null, '2020-03-23 15:49:00', null);
INSERT INTO `sys_bp_user_dim` VALUES ('47', 'B1901421', 'HZP', '10174c78abce68ddbcfa48398f376753', 'IT', '18317777901', '2733071538@qq.com', '1', null, '2020-03-25 10:15:09', null);
INSERT INTO `sys_bp_user_dim` VALUES ('48', 'B178234', '不不不', '9c1ae194a42da070c95ce353b46acbc6', 'IT', '', '2733071538@qq.com', '0', null, '2020-04-03 17:23:11', null);
INSERT INTO `sys_bp_user_dim` VALUES ('49', 'A12345', 'cxq', '9c1ae194a42da070c95ce353b46acbc6', 'IT', '', '2733071538@qq.com', '0', null, '2020-04-03 17:24:33', null);
INSERT INTO `sys_bp_user_dim` VALUES ('50', 'A099037', '郭曼', '9c1ae194a42da070c95ce353b46acbc6', '专显运营部规划科', '13410829216', 'man_guo2@tianma.cn', '0', null, '2020-04-13 14:08:24', null);
INSERT INTO `sys_bp_user_dim` VALUES ('51', 'b5678', 'BXC', '9c1ae194a42da070c95ce353b46acbc6', 'IT', '15754321234', '2733071538@qq.com', '0', null, '2020-04-21 10:49:53', null);
INSERT INTO `sys_bp_user_dim` VALUES ('52', 'B1893458', '里斯', '9c1ae194a42da070c95ce353b46acbc6', '', '', 'xiaoqing_chen@tianma.cn', '0', null, '2020-04-21 10:50:00', null);
INSERT INTO `sys_bp_user_dim` VALUES ('53', '1221434', '4535', '9c1ae194a42da070c95ce353b46acbc6', '1432', '15754310658', '2733071538@qq.com', '0', null, '2020-04-23 11:15:03', null);
INSERT INTO `sys_bp_user_dim` VALUES ('54', 'B1234567', 'dfd', '9c1ae194a42da070c95ce353b46acbc6', 'dsfgvfd', '15754310652', '2733071538@qq.com', '0', null, '2020-04-23 11:21:09', null);
INSERT INTO `sys_bp_user_dim` VALUES ('55', 'wer4ewtr', '232143', '9c1ae194a42da070c95ce353b46acbc6', '134r3w4tr', '15754300653', '2733071538@qq.com', '1', null, '2020-04-23 18:09:43', null);

-- ----------------------------
-- Table structure for `user_form_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_form_info`;
CREATE TABLE `user_form_info` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `User_Code` varchar(60) DEFAULT NULL,
  `User_Name` varchar(255) DEFAULT NULL,
  `User_Password` varchar(60) DEFAULT NULL,
  `Dept` varchar(60) DEFAULT NULL,
  `Phone_Number` varchar(60) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Invalid_Flag` tinyint(1) DEFAULT NULL,
  `Oper_Sign` varchar(60) DEFAULT NULL,
  `Create_User` varchar(60) DEFAULT NULL,
  `Create_Date` datetime DEFAULT NULL,
  `Record_Date` datetime DEFAULT NULL,
  `Approval_Id` int(11) DEFAULT NULL,
  `Case_Title` varchar(255) DEFAULT NULL,
  `Case_Status` int(11) DEFAULT NULL,
  `Apply_Reason` varchar(255) DEFAULT NULL,
  `Menu_List` varchar(255) DEFAULT NULL,
  `Authority_List` varchar(255) DEFAULT NULL,
  `Case_Id` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `User_Code_UNIQUE` (`User_Code`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_form_info
-- ----------------------------
INSERT INTO `user_form_info` VALUES ('39', 'B134256', '小小', null, '运营', '15754310652', '2733071538@qq.com', null, null, 'B134256', '2019-12-29 14:49:55', null, '4', '小小的用户申请注册', '1', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('40', 'B897654', '成成', null, 'IT', '15754310642', 'xiaoqing_chen@tianma.cn', null, null, 'B897654', '2019-12-30 18:58:10', null, '4', '成成的用户申请注册', '1', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('41', 'D189452', '小熊啊', null, '部门1', '15754310652', '13456789@qq.com', null, null, 'D189452', '2020-01-17 18:28:42', null, '4', '小熊啊的用户申请注册', '1', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('42', 'K098765', 'Cxq', null, 'CC', '18989765432', '2733071538@qq.com', null, null, 'K098765', '2020-01-17 18:40:38', null, '4', 'Cxq的用户申请注册', '1', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('43', 'B786905', 'chenchen', null, 'IT', '', 'xiaoqing_chen@tianma.cn', null, null, 'B786905', '2020-03-19 09:16:42', null, '4', 'chenchen的用户申请注册', '0', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('44', 'A12345', 'cxq', null, 'IT', '', '2733071538@qq.com', null, null, 'A12345', '2020-03-20 15:41:45', null, '4', 'cxq的用户申请注册', '1', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('45', 'b5678', 'BXC', null, 'IT', '15754321234', '2733071538@qq.com', null, null, 'b5678', '2020-03-23 14:20:57', null, '4', 'BXC的用户申请注册', '1', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('47', 'a987654332', '12343', null, 'edwds', '15754310658', '2733071538@qq.com', null, null, 'a987654332', '2020-03-23 14:22:08', null, '4', '12343的用户申请注册', '2', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('48', 'B190056', 'xiaoiqng', null, 'IT', '15754310653', 'xiaoqing_chen@tianma.cn', null, null, 'B190056', '2020-03-23 14:26:04', null, '4', 'xiaoiqng的用户申请注册', '0', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('49', 'B189345', '陈小青', null, '1WE', '15754310653', 'xiaoqing_chen@tianma.cn', null, null, 'B189345', '2020-03-23 15:39:47', null, '4', '陈小青的用户申请注册', '0', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('50', 'B89765', 'Test', null, '运营', '15754310658', '2733071538@qq.com', null, null, 'B89765', '2020-03-23 17:06:22', null, '4', 'Test的用户申请注册', '2', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('51', 'BFG', 'CXS', null, 'TY', '15754320658', 'xiaoqing_chen@tianma.cn', null, null, 'BFG', '2020-03-23 20:08:33', null, '4', 'CXS的用户申请注册', '0', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('52', 'B1901421', 'HZP', null, 'IT', '18317777901', '2733071538@qq.com', null, null, 'B1901421', '2020-03-25 10:12:11', null, '4', 'HZP的用户申请注册', '1', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('53', 'B178234', '不不不', null, 'IT', '', '2733071538@qq.com', null, null, 'B178234', '2020-04-03 17:22:19', null, '4', '不不不的用户申请注册', '1', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('54', 'A099037', '郭曼', null, '专显运营部规划科', '13410829216', 'man_guo2@tianma.cn', null, null, 'A099037', '2020-04-13 13:46:03', null, '4', '郭曼的用户申请注册', '1', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('55', 'B189343', 'chenchen', null, 'IT', '15754310652', 'xiaoqing_chen@tianma.cn', null, null, 'B189343', '2020-04-16 10:04:37', null, '4', 'chenchen的用户申请注册', '0', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('56', '11111', '顶顶顶顶', null, 'dd', '15754310652', '2733071538@qq.com', null, null, '11111', '2020-04-18 16:03:07', null, '4', '顶顶顶顶的用户申请注册', '0', 'www', null, null, null);
INSERT INTO `user_form_info` VALUES ('58', '1111122', '顶顶顶顶', null, 'dd', '15754310652', '2733071538@qq.com', null, null, '1111122', '2020-04-18 16:05:41', null, '4', '顶顶顶顶的用户申请注册', '0', 'www', null, null, null);
INSERT INTO `user_form_info` VALUES ('59', 'B12345', 'CDCD', null, 'CDCD', '15754310652', '2733071538@qq.com', null, null, 'B12345', '2020-04-18 16:10:06', null, '4', 'CDCD的用户申请注册', '0', 'CCCC', null, null, null);
INSERT INTO `user_form_info` VALUES ('61', 'B1893451', '里斯', null, null, null, 'xiaoqing_chen@tianma.cn', null, null, 'B1893451', '2019-10-19 10:29:00', null, '4', '里斯的菜单申请流程', '0', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('62', 'B1893458', '里斯', null, null, null, 'xiaoqing_chen@tianma.cn', null, null, 'B1893458', '2019-10-19 10:29:00', null, '4', '里斯的菜单申请流程', '1', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('64', 'B18934580', '里斯', null, null, null, 'xiaoqing_chen@tianma.cn', null, null, 'B18934580', '2019-10-19 10:29:00', null, '4', '里斯的菜单申请流程', '0', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('65', 'B1894580', '里斯', null, null, null, 'xiaoqing_chen@tianma.cn', null, null, 'B1894580', '2019-10-19 10:29:00', null, '4', '里斯的菜单申请流程', '0', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('66', 'B18945580', '里斯', null, null, null, 'xiaoqing_chen@tianma.cn', null, null, 'B18945580', '2019-10-19 10:29:00', null, '4', '里斯的菜单申请流程', '0', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('68', 'B18910', '里斯', null, null, null, 'xiaoqing_chen@tianma.cn', null, null, 'B18910', '2019-10-19 10:29:00', null, '4', '里斯的菜单申请流程', '0', null, null, null, null);
INSERT INTO `user_form_info` VALUES ('69', 'B189105', '里斯', null, null, null, 'xiaoqing_chen@tianma.cn', null, null, 'B189105', '2019-10-19 10:29:00', null, '4', '里斯的菜单申请流程', '0', 'kkk', null, null, null);
INSERT INTO `user_form_info` VALUES ('70', 'B786543', 'cxqq', null, 'IT', '15754310653', 'xiaoqing_chen@tianma.cn', null, null, 'B786543', '2020-04-20 15:44:40', null, '6', 'cxqq的用户申请注册（带审批节点）', '2', '申请原因，必填项', null, '', '37');
INSERT INTO `user_form_info` VALUES ('71', 'B189109', '里斯', null, null, null, 'xiaoqing_chen@tianma.cn', null, null, 'B189105', '2019-10-19 10:29:00', null, '4', '里斯的菜单申请流程', null, 'kkk', null, '[\"1\",\"2\"]', null);
INSERT INTO `user_form_info` VALUES ('72', null, '里斯', null, null, null, 'xiaoqing_chen@tianma.cn', null, null, 'B189105', '2019-10-19 10:29:00', null, '4', '里斯的菜单申请流程', null, 'kkk', null, '[{\"name\":\"1\"},{\"name\":\"3\"}]', null);
INSERT INTO `user_form_info` VALUES ('73', 'B18978543', '里斯', null, null, null, 'xiaoqing_chen@tianma.cn', null, null, 'B18978543', '2020-04-22 10:29:00', null, '6', '里斯的菜单申请流程', '0', 'kkk', null, '[\"1\",\"2\"]', '38');
INSERT INTO `user_form_info` VALUES ('74', '123', '3456', null, '111', '15754301652', '2733071538@qq.com', null, null, '123', '2020-04-22 16:22:54', null, '6', '3456的用户申请注册（带审批节点）', '1', '12343', null, '[\"10002\",\"10003\",\"WD1002\",\"W71002\"]', '39');
INSERT INTO `user_form_info` VALUES ('75', 'B123456', 'gggg', null, '555', '15754310523', '2733071538@qq.com', null, null, 'B123456', '2020-04-23 10:21:58', null, '6', 'gggg的用户申请注册（带审批节点）', '2', '34551343', null, '[\"W71002\",\"WD1002\"]', '40');
INSERT INTO `user_form_info` VALUES ('76', '1234555', '4555555', null, '243', '15754301658', '2733071538@qq.com', null, null, '1234555', '2020-04-23 10:36:36', null, '6', '4555555的用户申请注册（带审批节点）', '0', '24545555', null, '[\"W71002\",\"WD1002\"]', '41');
INSERT INTO `user_form_info` VALUES ('77', '1221434', '4535', null, '1432', '15754310658', '2733071538@qq.com', null, null, '1221434', '2020-04-23 10:59:47', null, '6', '4535的用户申请注册（带审批节点）', '1', '23432344', null, '[\"W71002\"]', '42');
INSERT INTO `user_form_info` VALUES ('78', 'B1234567', 'dfd', null, 'dsfgvfd', '15754310652', '2733071538@qq.com', null, null, 'B1234567', '2020-04-23 11:18:42', null, '6', 'dfd的用户申请注册（带审批节点）', '1', '1232423', null, '[]', '43');
INSERT INTO `user_form_info` VALUES ('79', '789654FG', 'TEST', null, 'IT', '15754310652', '2733071538@qq.com', null, null, '789654FG', '2020-04-23 11:25:56', null, '6', 'TEST的用户申请注册（带审批节点）', '0', 'TEST', null, '[\"10002\",\"10003\",\"WD1002\",\"W71002\"]', '44');
INSERT INTO `user_form_info` VALUES ('80', 'wer4ewtr', '232143', null, '134r3w4tr', '15754300653', '2733071538@qq.com', null, null, 'wer4ewtr', '2020-04-23 17:49:52', null, '6', '232143的用户申请注册（带审批节点）', '1', '343r4ere', null, '[\"10002\",\"10003\",\"WD1002\",\"W71002\"]', '45');
