<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%

String id = request.getParameter("id");
String password = request.getParameter("password");
String name = request.getParameter("name");
String gender = request.getParameter("gender");
String email = request.getParameter("email");
%>
<body>
	<h1> You registered successfully.</h1>
	<ul>
		<li>Id: <%=id %></li>
		<li>Password: <%=password %></li>
		<li>Name: <%=name %></li>
		<li>Gender: <%=gender %></li>
		<li>Email: <%=email %></li>
	</ul>
	<p>
		<a href="/hw1-helloMVC/index.jsp"> go to home page </a>
	</p>


</body>
</html>