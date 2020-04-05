<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>用户信息登记</title>
</head>
<body>

<%--
 1. 表单中的 name 属性值，要和绑定的模型类属性名一样
 2. 例： 这里要绑定 User 类， User 的属性为 private String userName; private int userAge;
 3. 表单中的 name 属性要与之相同 name="userName" name="userAge"
 --%>
<form action="${pageContext.request.contextPath}/addUser.form" method="post">
  用户名：<input type="text" name="userName"/> <br/>
  用户年龄：<input type="text" name="userAge"/> <br/>
  <input type="submit" value="提交">
</form>
</body>
</html>
