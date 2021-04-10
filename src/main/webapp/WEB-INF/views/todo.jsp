<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
<div class="container">
<h1>Add todo</h1>
<form action="add-todos" method="post">
<fieldset class="form-group">
<label>Description: </label><input type="text" name="desc" class="form-control" required="required">
</fieldset>
<input class ="btn btn-success" type="submit" value="Add">
</form>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>