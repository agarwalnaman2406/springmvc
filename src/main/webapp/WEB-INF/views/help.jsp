<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<title>Spring MVC Tutorial</title>
<body>
<h2>Hello World!</h2>

<%
	String name = (String)request.getAttribute("name");
%>

<h1>Name is <%= name %></h1>
 
	<c:forEach var="item" items="${roll }">
		<h1>${item }</h1>
	</c:forEach>
	


</body>
</html>
