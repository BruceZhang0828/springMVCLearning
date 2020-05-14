<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form:form action="dataValidate"  modelAttribute="user" method="post">
    编号:<form:input path="id"></form:input><form:errors path="id"></form:errors>--->${errorInfo.id} <br/>
    姓名:<form:input path="name"></form:input><form:errors path="name"></form:errors>--->${errorInfo.name}<br/>
    年龄:<form:input path="age"></form:input><form:errors path="age"></form:errors>--->${errorInfo.age}<br/>
    性别:<form:input path="gender"></form:input><form:errors path="gender"></form:errors>--->${errorInfo.gender}<br/>
    生日:<form:input path="birth"></form:input><form:errors path="birth"></form:errors>--->${errorInfobirth}<br/>
    邮箱:<form:input path="email"></form:input><form:errors path="email"></form:errors>--->${errorInfo.email}<br/>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
