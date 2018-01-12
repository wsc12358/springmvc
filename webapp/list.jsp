<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表页</title>
</head>
<body>
	<table>
		<tbody>
			<tr>
				<th>ID</th>
				<th>姓名</th>
				<th>年龄</th>
			</tr>
		</tbody>

		<c:if test="${!empty userList }">
			<c:forEach items="${userList}" var="user">
				<tr>
					<td>${user.id }</td>
					<td>${user.name }</td>
					<td>${user.age }</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>