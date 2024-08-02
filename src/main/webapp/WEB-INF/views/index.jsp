<html>
<body>
<h2>Hello World!</h2>
<title>Spring MVC Tutorial</title>

<%
	String name = (String)request.getAttribute("name");
%>

<h1>Name is <%= name %></h1>


</body>
</html>
