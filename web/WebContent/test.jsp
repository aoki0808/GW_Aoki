<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>転送されました</title>
</head>
<body>
<h1>ごちそうさまです。</h1>

<p>sessionで送られたnameは「<%= session.getAttribute("name") %>」</p>
<p>requestで送られたageは「<%= request.getAttribute("age") %>」</p>
</body>
</html>