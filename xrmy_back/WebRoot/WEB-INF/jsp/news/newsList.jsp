<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/table.css" /> 
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/admin.css" /> 

<script type="text/javascript">
function altRows(id){
	if(document.getElementsByTagName){  
		
		var table = document.getElementById(id);  
		var rows = table.getElementsByTagName("tr"); 
		 
		for(i = 0; i < rows.length; i++){          
			if(i % 2 == 0){
				rows[i].className = "evenrowcolor";
			}else{
				rows[i].className = "oddrowcolor";
			}      
		}
	}
}

window.onload=function(){
	altRows('alternatecolor');
}
</script>
</head>
<body> 
<%@ include file="../head.jsp" %> 
新闻列表:
<table class="altrowstable" id="alternatecolor">
<tr>
	<th>新闻标题</th>
	<th>新闻出处</th>
	<th>创建日期</th>
	<th>新闻内容</th>
	<th>操作</th>
</tr>
<c:forEach items="${newsList }" var="item">
<tr>
	<td>${item.title }</td>
	<td>${item.newsFrom }</td>
	<td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd"/></td>
	<td><div class="content">${item.content }</div></td>
	
	<td><a href="${pageContext.request.contextPath }/news/editNews.action?id=${item.id}">修改</a>
	    <a href="javascript:if(confirm('确实要删除该内容吗?'))location.href='${pageContext.request.contextPath }/news/deleteNews.action?id=${item.id}'">删除</a>
	</td>

</tr>
</c:forEach>

</table>

<center><a href="${pageContext.request.contextPath }/news/addNews.action">添加新闻</a></center>
</body>

</html>