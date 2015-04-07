<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<a class="brand" href="http://www.wikywf.com">wikywf.com</a>
<div class="nav-collapse collapse">
              <ul class="nav">
            	<li><a href="index.html" class="dropdown-toggle">门户</a></li>
           	 	<li><a href="${context_path}/bbsindex.html">论坛频道</a></li>
           		<li><a href="${context_path}/blogindex.html">博客频道</a></li>
           		<li><a href="${context_path}/musicindex.html">音乐频道</a></li>
         	 </ul>
              <form action="" class="pull-right">
              </form>
              <ul class="nav navbar-nav pull-right navbar-right">
               <li><a href="${context_path}/user_userreg.html">注册</a></li>
               <li><a href="${context_path}/user_userlog.html">登陆</a></li>
               <li><a href="${context_path}/user_userlog.html">用户中心</a></li>
             </ul>
 </div>