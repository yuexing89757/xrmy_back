<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
</head>
<body> 

商品列表：
<table width="100%" border=1>
<tr>
	<td>新闻标题</td>
	<td>新闻出处</td>
	<td>创建日期</td>
	<td>新闻内容</td>
	<td>操作</td>
</tr>
<c:forEach items="${newsList }" var="item">
<tr>
	<td>${item.title }</td>
	<td>${item.newsFrom }</td>
	<td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd"/></td>
	<td>${item.content }</td>
	
	<td><a href="${pageContext.request.contextPath }/news/editNews.action?id=${item.id}">修改</a>
	    <a href="javascript:if(confirm('确实要删除该内容吗?'))location.href='${pageContext.request.contextPath }/news/deleteNews.action?id=${item.id}'">删除</a>
	</td>

</tr>
</c:forEach>

</table>

<center><a href="${pageContext.request.contextPath }/news/addNews.action">添加新闻</a></center>
</body>

</html>