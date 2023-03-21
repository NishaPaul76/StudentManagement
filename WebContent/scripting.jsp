<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scripting Page</title>
</head>
<body>

<h1> Below Output is all about Scripting </h1>

<%! 
	int i =10;
	public int f1 ()
	{
		return 10;
	}
	public String f2()
	{
		return "palle";
	}
%>
<%
	int i = f1();
	String s = f2();
	out.println(i);
	out.println(s);
%>

</body>
</html>