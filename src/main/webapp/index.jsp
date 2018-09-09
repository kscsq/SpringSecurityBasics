<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>
<a href="/showmessage.html">Click to enter</a>
<form action="logout" method="post">
    <input type="submit" value="Logout"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
</form>
</body>
</html>
