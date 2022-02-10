<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン成功画面</title>
</head>
<body>
ようこそ！！${sessionScope.user.name}さん。<br>

<form action="<%= request.getContextPath() %>/Controller" method="post">
<input type="hidden" name="ACTION" value="LOGOUT">
<input type="submit" value="ログアウト">
</form>

</body>
</html>