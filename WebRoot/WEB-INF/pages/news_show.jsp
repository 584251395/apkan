<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="/WEB-INF/pages/common/head.jsp"%>
<div id="mid" style="width: 100%;height:530px">

	<!-- right -->
	
	 <div style="width:100%;height:20px; background-image:url('${context_path}/images/bg1.png') ;border:1px solid #BEC6EF;">
	  新闻显示
	 </div>
	<div style="width:100%; height:500px;float: right;border:1px solid #BEC6EF;">
	   <div style="text-align:center;height:30px; width: 100%;">${requestScope.news.name }</div>
	   <div style="text-align:left;height:440px; width: 97%;float:right;">
	     ${requestScope.news.content } 
	   
	   </div>
	 
	   <div style="text-align:right;height:30px; width: 100%;border-bottom:1px solid #BEC6EF;float:right;">
	      发表时间: ${requestScope.news.publicTime } 
	   </div>
	</div>

 
</div>
<!-- bottom -->
<%@include file="/WEB-INF/pages/common/bottom.jsp"%>
