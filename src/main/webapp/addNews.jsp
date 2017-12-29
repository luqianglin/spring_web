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
	<h3>添加新闻</h3>
	<form action="addNews" method="post">
		标题:<input type="text" name="title" ><br><br>
		内容:<textarea rows="20" cols="22" name="content"></textarea><br><br>
		<input type="submit" value="添加新闻" ><br><br>
	</form>
	<a href="NewsController">返回</a>
	</div>
</body>
</html>