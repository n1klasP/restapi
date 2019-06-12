<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta charset="utf-8">
</head>
<body>
<h1>Details</h1>

<form:form  modelAttribute="person">
    <form:input path="id" type="hidden" />

    <table>
        <tr>
            <td>Vorname:</td>
            <td><form:input path="firstName" /></td>
        </tr>

        <tr>
            <td>Nachname:</td>
            <td><form:input path="lastName" /></td>
        </tr>

        <tr>
            <td>Straße:</td>
            <td><form:input path="street" /></td>
        </tr>

        <tr>
            <td>Postleitzahl:</td>
            <td><form:input path="zipCode" /></td>
        </tr>

        <tr>
            <td>Stadt:</td>
            <td><form:input path="city" /></td>
        </tr>

    </table>

    <br/>

    <td><input type="submit" value="Speichern"/></td>
</form:form>
</body>
</html>