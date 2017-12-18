<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Simple Graphic Editor</title>
</head>
<body>
	<h1>It works!</h1>
	<center>
	<form action="test" method="post">
	Please enter the shape: <input type="text" name="shape" size="5">
	<input type="submit" value="Submit">
	</form>
	<canvas id="canvas" style="border:2px solid black;" width="200" height="200">
	
	</canvas>
	</center>
</body>
</html>