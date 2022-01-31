
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>


<head>

<title>
add employee
</title>

</head>
<body>
<jsp:include page="home.jsp"></jsp:include>

<h1>Add Employee</h1>

<form:form method="post" action="/submitempdata" modelAttribute="emp">
Enter emp id<form:input path="id"/>
<br>
Enter emp name<form:input path="name"/>
<br>
Enter emp salary<form:input path="salary"/>
<br>
Enter emp location<form:input path="location"/>

<input type="submit" value="ADD">

</form:form>

</body>


</html>