<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
 integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<title>Welcome</title>
</head>
<body>
<h1>${commonMessage}</h1>
<%-- <% User user = (User)request.getAttribute("user") %> 
String user = user.getName()
out.println(user);
;--%> 
<div class="container">
<div class="jumbotron">
<p>User Detail</p>
 <p>Name : ${user.name}</p>
<p>Contact: ${user.contact}</p>
<p>Email : ${user.email}</p> 
<p>Joining Date : ${user.joining}</p> 
 <p>Skills :<c:forEach items="${user.skills}" var="skill">
${skill}
</c:forEach> </p> 
<p>Address Details :</p>
<p>House No : ${user.address.houseno}</p>
<p>City : ${user.address.city}</p>
<p>State : ${user.address.state}</p>
<p>Zip : ${user.address.zip}</p>
</div>
</div>
</body>
</html>