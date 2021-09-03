<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="de">
<head>
</head>
<body>
<form>
    <div class="form-group">
        <label>Vorname:</label> <input type="text" class="form-control" name="text_firstName" value="${person.firstName}">
    </div>

    <div class="form-group">
        <label>Nachname:</label> <input type="text" class="form-control" name="text_lastName" value="${person.lastName}">
    </div>

    <div class="form-group">
        <label>Straße:</label> <input type="text" class="form-control" name="text_street" value="${person.street}">
    </div>

    <div class="form-group">
        <label>Postleitzahl:</label> <input type="text" class="form-control" name="text_zipCode" value="${person.zipCode}">
    </div>

    <div class="form-group">
        <label>Stadt:</label> <input type="text" class="form-control" name="text_city" value="${person.city}">
    </div>

    <div class="form-group">
        <input type="submit" class="btn btn-primary" name="button_save" value="Speichern">
    </div>
</form>
</body>
</html>
