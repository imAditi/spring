<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>${commonMessage}</h1>
<%-- <% User user = (User)request.getAttribute("user") %> 
String user = user.getName()
out.println(user);
;--%> 
<h1>User Detail</h1>
 <h1>Name : ${user.name}</h1>
<h1>Contact: ${user.contact}</h1>
<h1>Email : ${user.email}</h1> 
</body>
</html>