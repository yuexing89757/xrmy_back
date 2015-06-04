<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>修改商品信息</title>

</head>
<body> 
<!-- 显示错误信息 -->
<c:if test="${allErrors!=null }">
	<c:forEach items="${allErrors }" var="error">
	${ error.defaultMessage}<br/>
</c:forEach>
</c:if>

<form id="itemForm" action="${pageContext.request.contextPath }/news/editNewsSubmit.action" method="post" >
<input type="hidden" name="id" value="${news.id }"/>
修改新闻信息：
<table width="100%" border=1>
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
	<td><input type="text" name="createTime" value="<fmt:formatDate value="${news.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td>
</tr>

<tr>
	<td>新闻类型</td>
	<td>
		<input type="text"  name="newsType"  value="${news.newsType }"/> 
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