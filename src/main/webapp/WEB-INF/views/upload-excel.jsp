<%--
  Created by IntelliJ IDEA.
  User: HungBang
  Date: 2/21/2017
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Form upload file excel</title>
</head>
<body>
        <spring:url value="/upload" var="urlUpload" />
            <form action="${urlUpload}" method="post" enctype="multipart/form-data">
                <input type="file" accept=".xls, .xlsx" name="file" />
                <input type="submit" value="UPLOAD NOW"/>
            </form>

            <p style="color: crimson">${message}</p>
</body>
</html>
