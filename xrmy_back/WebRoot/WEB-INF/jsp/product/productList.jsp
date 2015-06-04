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
	<td>${item.describtion }</td>
	<td>${item.viedoUrl }</td>
	<td>
			<c:if test="${items.ifRecommend ==0}">
					是
			</c:if>
			<c:if test="${items.ifRecommend ==1}">
					否
			</c:if>
	</td>
	
	<td><a href="${pageContext.request.contextPath }/product/editProduct.action?id=${item.id}">修改</a></td>

</tr>
</c:forEach>

</table>
</body>

</html>