<%--
  Created by IntelliJ IDEA.
  User: zhy
  Date: 2020/5/9
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<br>
操作成功<br>
request:${requestScope.get("requestParam")}
request:${requestScope.get("msg")}
session:${sessionScope.get("sessionParam")}
session:${sessionScope.get("msg")}
${msg}
${user}
</body>
</html>
