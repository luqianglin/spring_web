<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="border:1px solid #000">
	<h3>修改新闻</h3>
	<form action="UpdateNews" method="post">
		<input type="hidden" name="newid" value="${param.newid}">
		标题:<input type="text" name="title" value="${param.title}" ><br><br>
		内容:<textarea rows="20" cols="22" name="content">${param.content }</textarea><br><br>
		<input type="submit" value="修改新闻" ><br><br>
	</form>
	<a href="NewsController">返回</a>
	</div>
</body>
</html>