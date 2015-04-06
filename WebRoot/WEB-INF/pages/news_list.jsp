<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="/WEB-INF/pages/common/head.jsp"%>
<div id="mid" style="width: 100%;height:630px">

	<!-- right -->
	
	 <div style="width:100%;height:20px; background-image:url('${context_path}/images/bg1.png') ;border:1px solid #BEC6EF;">
	  新闻
	 </div>
	<div style="width:100%; height:500px;float: right;border:1px solid #BEC6EF;">
	   <s:iterator value="pageModel.list">
	    <div>
	     <s:url action="news" namespace="/customer/news" var="n_sel">
		   <s:param name="id" value="id"></s:param>
		</s:url>
		 <a href="${n_sel}">
		  <s:property value="name"/>
		 </a>
	    </div>
	   </s:iterator>
	</div>
	 <div  style="text-align:right;height:50px; width: 100%;border-bottom:1px solid #BEC6EF;float:right;">
	     <s:url action="newslist" namespace="/customer/news" var="first">
			<s:param name="pageNo" value="1"></s:param>
		</s:url> 
		<s:url action="newslist" namespace="/customer/news" var="previous">
			<s:param name="pageNo" value="pageModel.pageNo-1"></s:param>
		</s:url>
	    <s:url action="newslist" namespace="/customer/news" var="last">
			<s:param name="pageNo" value="pageModel.bottomPageNo"></s:param>
	    </s:url> 
	    <s:url action="newslist" namespace="/customer/news" var="next">
			<s:param name="pageNo" value="pageModel.pageNo+1"></s:param>
		</s:url> 
		<s:include value="/WEB-INF/pages/common/page.jsp"></s:include>
	  </div>
</div>
<!-- bottom -->
<%@include file="/WEB-INF/pages/common/bottom.jsp"%>
