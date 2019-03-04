<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
 integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Insert title here</title>

</head>
<body>
<h1>${commonMessage}</h1>
<div class="container">
<div class="jumbotron">
<form action="store" method="post">
			<div class="form-group">
				<label for="title">Title</label>
				<input type="text" class="form-control" name="title" placeholder="title"/>
		</div>
		<br/>
		<div class="form-group">
				<label for="body">Body</label>
				<textarea rows="7" class="form-control" name="body" placeholder="body"></textarea>
		</div>
		<br/>
				<div class="form-group">
				<label for="category.cname">Categories</label>
				<select name="category.cname" multiple="multiple">
				<option value="Spring">Spring</option>
				<option value="Hibernate">Hibernate</option>
				<option value="C">C</option>
				<option value="JSP">JSP</option>
				<option value="Servlet">Servlet</option>
				<option value="Core">Core</option>
				</select>
		</div>
		<button type="submit" class="btn-primary">Add Blog</button>
		</div>
		
	
		
		
</form>
</div>
</div>
</body>
</html>