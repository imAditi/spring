<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<title>Insert title here</title>

</head>
<body>
<div class="container">
<div class="jumbotron">
<form action="store" method="post">
			<div class="form-group">
				<label for="name">Name</label>
				<input type="text" class="form-control" name="name" placeholder="name">
		</div>
		<div class="form-group">
				<label for="contact">Contact</label>
				<input type="text" class="form-control" name="contact" placeholder="contact">
		</div>
		<div class="form-group">
				<label for="email">Email</label>
				<input type="email" class="form-control" name="email" placeholder="email">
		</div>
		<button type="submit" class="btn-primary">Save</button>

</form>
</div>
</div>
</body>
</html>