<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<form id="itemForm" action="${pageContext.request.contextPath }/product/addProductSubmit.action" method="post" >

添加商品信息：
<table class="altrowstable">
<tr>
	<td>标题</td>
	<td><input type="text" name="name" value="${product.name }"/></td>
</tr>
<tr>
	<td>商品价格</td>
	<td><input type="text" name="price" value="${product.price }"/></td>
</tr>

<tr>
	<td>商品图片</td>
	<td>
		<c:if test="${product.photo !=null}">
			<img src="${product.photo}" width=100 height=100/>
			<br/>
		</c:if>
		<input type="text"  name="photo"  value="${product.photo }"/> 
	</td>
</tr>


<tr>
	<td>商品简介</td>
	<td>
	<textarea rows="10" cols="50" name="describtion">${product.describtion }</textarea>
	</td>
</tr>

<tr>
	<td>商品类型</td>
	<td>
		<select name="productType" id="productType">
		  <option value ="ACTIVE">正在出售</option>
		  <option value ="PREPARING">预出售</option>
		  <option value="SOLDOUT">售罄</option>
		</select> 
	</td>
</tr>



<tr>
	<td>是否推荐</td>
	<td>
	    <select name="ifRecommend" id="ifRecommend">
		  <option value ="true">是</option>+
		  <option value ="false">否</option>
		</select> 
	</td>
</tr>

<tr>
	<td>视频地址</td>
	<td><input type="text" name="viedoUrl" value="${product.viedoUrl }"/></td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>
</body>

</html>