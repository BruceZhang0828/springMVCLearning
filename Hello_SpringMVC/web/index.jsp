<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    pageContext.setAttribute("ctp",request.getContextPath());
%>
<body>
<form action="dateConvertion" method="post">
    编号：<input type="text" name="id"><br>
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    性别：<input type="text" name="gender"><br>
    日期：<input type="text" name="birth"><br>
    <input type="submit" value="提交">
</form>
<img src="15.jpg">
</body>
</html>
