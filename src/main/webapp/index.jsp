<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		.id1{
			width:20%;
		}
		.ti{
			width:30%;
		}
	</style>
</head>
<body>
	<form action="NewsController1" method="get">
		内容<input type="text" name="myContent" value="${param.content}">
		<input type="submit" value="搜索"/>
	</form>
	<table border="1">
		<tr>
			<th class='id1'>新闻编号</th>
			<th class='ti'>新闻标题</th>
			<th>新闻内容</th>
		</tr>
		<c:forEach var="tmp" items="${newsList}">
			<tr>
				<td>${pageScope.tmp.newid}</td>
				<td>${pageScope.tmp.title}</td>
				<td>${pageScope.tmp.content}</td>
			</tr>
		</c:forEach>
	</table>
</html>