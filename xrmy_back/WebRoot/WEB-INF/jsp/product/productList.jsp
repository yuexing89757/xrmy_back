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

商品列表：
<table  class="altrowstable" id="alternatecolor">
<tr>
	<th>商品标题</th>
	<th>商品价格</th>
	<th>商品状态</th>
	<th>商品图片</th>
	<th>商品描述</th>
	<th>视频地址</th>
	<th>是否推荐</th>
	<th>操作</th>
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