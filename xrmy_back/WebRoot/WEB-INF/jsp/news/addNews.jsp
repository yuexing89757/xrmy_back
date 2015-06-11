<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品信息</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.3.2.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-calendar.js"></script> 
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/jquery-calendar.css" /> 
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/table.css" /> 
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/admin.css" /> 
</head>
<body> 
<%@ include file="../head.jsp" %> 

<!-- 显示错误信息 -->
<c:if test="${allErrors!=null }">
	<c:forEach items="${allErrors }" var="error">
	${ error.defaultMessage}<br/>
</c:forEach>
</c:if>

<form id="itemForm" action="${pageContext.request.contextPath }/news/addNewsSubmit.action" method="post" >

添加新闻信息：
<table class="altrowstable">
<tr>
	<td>标题</td>
	<td><input type="text" name="title" value="${news.title }"/></td>
</tr>
<tr>
	<td>新闻出处</td>
	<td><input type="text" name="newsFrom" value="${news.newsFrom }"/></td>
</tr>
<tr>
	<td>创建日期</td>
	<td><input type="text" id="calendar1"  name="createTime" 
	 value="<fmt:formatDate value="${news.createTime}" pattern="yyyy-MM-dd"/>"
	 maxlength="10" onfocus="$(this).calendar()"/></td>
</tr>

<tr>
	<td>新闻类型</td>
	<td>
		<select name="newsType" id="newsType">
		  <option value ="COMPANY">公司新闻</option>
		  <option value ="ADVANCE">行业新闻</option>
		  <option value="TREND">新品代售</option>
		</select> 
	</td>
</tr>

<tr>
	<td>新闻内容</td>
	<td>
	<textarea rows="30" cols="100" name="content">${news.content }</textarea>
	</td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>
</body>

</html>