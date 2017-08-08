<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

form page
<br><br>
	<form:form action="${pageContext.request.contextPath}/testFormPost" method="POST" modelAttribute="user">
		lastname:<form:input path="lastname"/>
			<form:errors path="lastname"/>
		<br><br>
		email:<form:input path="email"/>
			<form:errors path="email"/>
	    	<br><br>
	    	date<form:input path="date"/>
	    	<form:errors path="date"/>
	    	<br><br>
	    <input type="submit" value="Submit">
	</form:form>

</body>
</html>