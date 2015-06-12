<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<table cellspacing=0 cellpadding=0 width="100%"
	background="${pageContext.request.contextPath }/img/header_bg.jpg"
	border=0>
	<tr height=56>
		<td width=260><img height=56
			src="${pageContext.request.contextPath }/img/header_left.jpg"
			width=260></td>
		<td width=260></td>
		
		
		<td width=260  class="tagsclass"><a href="${pageContext.request.contextPath }/news/queryNews.action"><span class="wordclass">新闻管理</span></a></td>
			
		<td width=260  class="tagsclass"><a href="${pageContext.request.contextPath }/product/queryProduct.action"><span class="wordclass">商品管理</span></a></td>
			
		<td width=260></td>
			
			
			
		<td width=260 style="font-weight: bold; color: #fff; padding-top: 20px"
			align=middle>当前用户：${username }， <c:if test="${username!=null }">
				<a href="${pageContext.request.contextPath }/logout.action"><span class="wordclass">退出</span></a>
			</c:if>
		</td>
		<td align=right width=268><img height=56
			src="${pageContext.request.contextPath }/img/header_right.jpg"
			width=268></td>
	</tr>
</table>
<table cellspacing=0 cellpadding=0 width="100%" border=0>
	<tr bgcolor=#1c5db6 height=4>
		<td></td>
	</tr>
</table>
</html>
