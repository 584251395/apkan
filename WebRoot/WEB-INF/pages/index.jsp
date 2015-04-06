<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="/WEB-INF/pages/common/head.jsp"%>
          <!--left col-->
          <div class="span10">
          <!--welcome-->
          <div class="alert-message block-message warning">      
          </div>
          <!--end welcome-->
          <!--start combinations-->
          <h2 class="demoHeaders">新闻动态</h2>
          <div>
          <table style="">
            <s:iterator value="news">
          <tr>
          <td>
         <div class="hrefself1"> 
          <h3>
		<s:url action="news" namespace="/news" var="n_sel">
				     <s:param name="id" value="id"></s:param>
		 </s:url>
		 <a href="${newsurl}">
	     <s:property value="newstitle"/>
	     </a>
	     </h3>
	     </div> 
	     <div>
	     <font color="#999999">
	         来源: <s:property value="newsauthor"/>&nbsp;&nbsp;
	         发表时间:<s:property value="newsdate"/>
	     </font>
	    </div>
	    <div>
	     <font size="3px" >
	     <s:property value="newscontent"/>...
	     </font>
	    </div>
	    <div>
	     <font size="3px"  color="green">
	     <s:property value="newsurl"/>
	     </font>
	    </div>
	    </td>
	    </tr>
		 </s:iterator>
		 </table>
          </div>
          </div>
          <!--end left col-->

          <!--right col-->
          <div class="span4">
            <!-- Vertical Slider -->
            <h2 class="demoHeaders">Vertical Slider</h2>
          </div>
          <!--end right col-->
       
<!-- bottom -->
<%@include file="/WEB-INF/pages/common/bottom.jsp"%>
