<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>ϵͳ��¼</h1>
		<hr>
		<form name="loginForm" action="<%=path %>/login.action" method="post">
		�û���:<input type="text" name="username"/><br>
		����:<input type ="password" name="password"><br>
		<input type="submit" value="�ύ">
		
		</form>
	</center>
</body>
</html>