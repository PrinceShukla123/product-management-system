<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String mass=(String)request.getAttribute("msg");
	out.println(mass);
	%>
	<a href="product.html">AddProduct</a>
	<a herf="view">View All Product</a>
	<a href="AdminLogin.html">Logout</a>
</body>
</html>