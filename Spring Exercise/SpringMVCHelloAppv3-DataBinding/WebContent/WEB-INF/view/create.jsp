<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
<span style="color:red;"><form:errors path="user.*"></form:errors></span>
<form action="store" method="post">
			<div class="form-group">
				<label for="name">Name</label>
				<input type="text" class="form-control" name="name" placeholder="name">
		</div>
		<br/>
		<div class="form-group">
				<label for="contact">Contact</label>
				<input type="text" class="form-control" name="contact" placeholder="contact">
		</div>
		<br/>
		<div class="form-group">
				<label for="email">Email</label>
				<input type="email" class="form-control" name="email" placeholder="email">
		</div>
		<br/>
				<div class="form-group">
				<label for="joining">Joining Date</label>
				<input type="text" class="form-control" name="joining" placeholder="joining">
		</div>
		<br/>
				<div class="form-group">
				<label for="skills">Skills</label>
				<select name="skills" multiple="multiple">
				<option value="Spring">Spring</option>
					<option value="Hibernate">Hibernate</option>
						<option value="C">C</option>
							<option value="JSP">JSP</option>
								<option value="Servlet">Servlet</option>
									<option value="Core">Core</option>
				</select>
		</div>
		</div>
		<div class="jumbotron">
				<div class="form-group">
				<h2>Address Information</h2>
				<hr/>
				<label for="houseno">House No </label>
				<input type="text" class="form-control" name="address.houseno"> <br/>
				
				<label for="city">City </label>
				<input type="text" class="form-control" name="address.city"> <br/>
				
				<label for="state">State </label>
				<input type="text" class="form-control" name="address.state"> <br/>
				
				<label for="zip">Zip </label>
				<input type="text" class="form-control" name="address.zip"> <br/>
		</div>
	<button type="submit" class="btn-primary">Save</button>
		</div>
		
</form>
</div>
</div>
</body>
</html>