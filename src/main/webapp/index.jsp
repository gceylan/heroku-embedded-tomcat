<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
		<form action="test-servlet" method="get">
			<center>
				<h2>Simple Form Example</h2>
				<hr>
				<table>
					<tr>
						<td>First Name:</td>
						<td><input type="text" name="firstname"></td>
					</tr>
					<tr>
						<td>Last Name:</td>
						<td><input type="text" name="lastname"></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Send"></td>
					</tr>
				</table>
			</center>
		</form>

	</div>
	<div>
		<a href="./test.jsp">test.jsp</a>
	</div>
	<div>
		<a href="show-request-headers">Show Request Headers</a>
	</div>

</body>
</html>