<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- webパッケージのEmpBeanクラスを指定 --%>
<jsp:useBean id="emp" scope="request" class="web.EmpBean"/>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<h1>UseBean</h1>
<table border>
    <tr>
        <td>Name</td>
        <%-- リクエストオブジェクトに格納されている
             beanの中のプロパティ名がnameの値を
             取得している
        --%>
        <td><jsp:getProperty name="emp" property="name"/></td>
    </tr>
    <tr>
        <td>Age</td>
        <td><jsp:getProperty name="emp" property="age"/></td>
    </tr>
</table>
</body>
</html>