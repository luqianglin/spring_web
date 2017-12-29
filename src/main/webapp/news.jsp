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
			width:10%;
		}
		.ti{
			width:20%;
		}
		.cz{
			width:10%;
		}
	</style>
</head>
<script type="text/javascript">
	function confirmDelete(fid){
		if(confirm("是否删除当前数据")){
			window.location="${pageContext.request.contextPath}/DeleteNews?newid="+fid;
		}
	}
</script>
<body>
	<form action="NewsController" method="get">
		内容<input type="text" name="myContent" value="${param.myContent}">
		<input type="submit" value="搜索"/>
	</form>
	<table border="1">
		<tr>
			<th class='id1'>新闻编号</th>
			<th class='ti'>新闻标题</th>
			<th>新闻内容</th>
			<td class='cz'>操作</td>
		</tr>
		<c:forEach var="tmp" items="${requestScope.newsList.data}">
			<tr>
				<td>${pageScope.tmp.newid}</td>
				<td>${pageScope.tmp.title}</td>
				<td>${pageScope.tmp.content}</td>
				<td>
					<a href="${pageContext.request.contextPath}/updateNews.jsp?newid=${pageScope.tmp.newid}&title=${pageScope.tmp.title}&content=${pageScope.tmp.content}" class="FunctionButton">更新</a> 
					<a href="javascript:confirmDelete(${pageScope.tmp.newid})" class="FunctionButton">删除</a>
				</td>
			</tr>
		</c:forEach>
		<tr>
				<td colspan="3">
					<a href="${pageContext.request.contextPath}/NewsController?curPage=1">首页</a>
					<a href="${pageContext.request.contextPath}/NewsController?curPage=${requestScope.newsList.prePage}">上一页</a>
				
					<c:forEach var="i" begin="1" end="${requestScope.newsList.totalPage}" step="1">
						<a href="${pageContext.request.contextPath}/NewsController?curPage=${pageScope.i}">${pageScope.i}</a>
					
					</c:forEach>
					<a href="${pageContext.request.contextPath}/NewsController?curPage=${requestScope.newsList.nextPage}">下一页</a>
					<a href="${pageContext.request.contextPath}/NewsController?curPage=${requestScope.newsList.totalPage}">尾页</a>
				</td>
		</tr>
	</table>
	<a href="${pageContext.request.contextPath}/addNews.jsp">添加</a>
	
</html>