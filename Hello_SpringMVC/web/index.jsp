<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    pageContext.setAttribute("ctp",request.getContextPath());
%>
<body>
<form action="${ctp}/update" method="post">
    <input type="hidden" value="1" name="id">
    姓名：张三<br>
    密码：<input type="text" name="password"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交">
</form>
<img src="15.jpg">
</body>
</html>
