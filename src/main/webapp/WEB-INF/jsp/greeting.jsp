<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="de">
<head>
</head>

<body>
    <h1>
        <spring:message code="hello"/> ${greeting.firstName} ${greeting.lastName}
    </h1>
</body>
</html>