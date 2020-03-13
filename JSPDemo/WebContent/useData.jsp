<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>from useData.jsp page</h1>
<%
String company1=request.getParameter("company1");
String company2=request.getParameter("company2");
out.write("<h1>"+company1+"&nbsp;&nbsp;"+company2+"</h1>");
%>

</body>
</html>