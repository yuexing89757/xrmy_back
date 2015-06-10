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
</head>
<body> 

商品列表：
<table width="100%" border=1>
<tr>
	<td>商品标题</td>
	<td>商品价格</td>
	<td>商品状态</td>
	<td>商品图片</td>
	<td>商品描述</td>
	<td>视频地址</td>
	<td>是否推荐</td>
	<td>操作</td>
</tr>
<c:forEach items="${productList }" var="item">
<tr>
	<td>${item.name }</td>
	<td>${item.price }</td>
	<td>${item.photo }</td>
	<td>${item.productType }</td>
	<td><div class="discribe">${item.describtion }</div></td>
	<td>${item.viedoUrl }</td>
	<td>
			<c:if test="${item.ifRecommend==true}">
			     是
			</c:if>
			<c:if test="${item.ifRecommend==false}">
			    否
			</c:if>
	</td>
	
	<td><a href="${pageContext.request.contextPath }/product/editProduct.action?id=${item.id}">修改</a>
	    <a href="javascript:if(confirm('确实要删除该内容吗?'))location.href='${pageContext.request.contextPath }/product/deleteProduct.action?id=${item.id}'">删除</a>
	</td>

</tr>
</c:forEach>

</table>
<center><a href="${pageContext.request.contextPath }/product/addProduct.action">添加商品</a></center>
</body>

</html>