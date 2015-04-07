<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<s:set var="context_path" value="#request.get('javax.servlet.forward.context_path')"></s:set>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="wikywf.com 是一个独立的免费社区网站，致力于推荐用户喜欢的歌曲，电影.....">
<meta name="author" content="wikywf.com"/>
<title>wikywf.com</title>
<s:head theme="simple"/>
<sd:head debug="true" cache="true" compressed="false" parseContent="true"/>
     <!--[if lt IE 9]>
      <script src="${context_path}/js/html5.js"></script>
    <![endif]-->
    <!-- Styles --> 
    <link type="text/css" href="${context_path}/jqueryuibootstrap/css/custom-theme/jquery-ui-1.9.2.custom.css" rel="stylesheet" />
    <link type="text/css" href="${context_path}/jqueryuibootstrap/assets/css/bootstrap.min.css" rel="stylesheet">
    <link type="text/css" href="${context_path}/jqueryuibootstrap/css/demo.css" rel="stylesheet">
    <link type="text/css" href="${context_path}/css/css.css" rel="stylesheet">
</head>
<body>
 <!--[if lt IE 9]>
  <link rel="stylesheet" type="text/css" href="${context_path}/jqueryuibootstrap/css/custom-theme/jquery.ui.1.9.2.ie.css"/>
  <![endif]-->
 <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <%@include file="/WEB-INF/pages/common/topnav.jsp"%>
        </div>
      </div>
    </div>
<div class="container">
     <%@include file="/WEB-INF/pages/common/welcome.jsp"%>
  <div class="content">
        <div class="row">
   
     