<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/Controller" method="post">
<input type="hidden" name="ACTION" value="LOGIN">
ユーザID：<input type="text" name="ID">

<br>

<input type="submit" value="ログイン">
</form>
</body>
</html>