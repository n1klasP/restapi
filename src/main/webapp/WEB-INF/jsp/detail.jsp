<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="de">
<head>
</head>
<body>
<form:form modelAttribute="person" method="post">
    <div class="form-group">
        <label>Vorname:</label> <form:input path="firstName" />
        <form:errors path="firstName" class="error"/>
    </div>

    <div class="form-group">
        <label>Nachname:</label> <form:input path="lastName" />
    </div>

    <div class="form-group">
        <label>Straße:</label> <form:input path="street" />
    </div>

    <div class="form-group">
        <label>Postleitzahl:</label> <form:input path="zipCode" />
    </div>

    <div class="form-group">
        <label>Stadt:</label> <form:input path="city" />
    </div>

    <div class="form-group">
        <input type="submit" class="btn btn-primary" name="button_save" value="Speichern">
    </div>
</form:form>
</body>
</html>
