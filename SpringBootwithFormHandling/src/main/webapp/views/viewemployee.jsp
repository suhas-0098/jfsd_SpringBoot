
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
<title>View All Employees</title>
</head>

<body>
<jsp:include page="home.jsp"></jsp:include>
<h2 align=center>View All Employee Records</h2><br/>

<table align=center border=1>
<tr>
<th>ID</th>
<th>Name</th>
<th>Salary</th>
<th>Location</th>
<th>Action</th>
</tr>
<c:forEach var="emp" items="${empdata}">

<tr>
<td>${emp.id}</td>
<td>${emp.name}</td>
<td>${emp.salary}</td>
<td>${emp.location}  </td>
<td><a href="/deletemployee/${emp.id}">Delete</a></td>
</tr>
</c:forEach>
</table>

</body>

</html>