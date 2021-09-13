<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="de">
<head>
</head>

<body>
<style type="text/css">
    .tg {
        border-collapse: collapse;
        border-spacing: 0;
    }

    .tg td {
        border-color: black;
        border-style: solid;
        border-width: 1px;
        font-family: Arial, sans-serif;
        font-size: 14px;
        overflow: hidden;
        padding: 10px 5px;
        word-break: normal;
    }

    .tg th {
        border-color: black;
        border-style: solid;
        border-width: 1px;
        font-family: Arial, sans-serif;
        font-size: 14px;
        font-weight: normal;
        overflow: hidden;
        padding: 10px 5px;
        word-break: normal;
    }

    .tg .th-head {
        border-color: inherit;
        font-weight: bold;
        text-align: center;
        vertical-align: top
    }
</style>
<table class="tg">
    <thead>
    <tr>
        <th class="th-head">Vorname</th>
        <th class="th-head">Nachname</th>
        <th class="th-head">Strasse</th>
        <th class="th-head">Postleitzahl</th>
        <th class="th-head">Stadt</th>
        <th class="th-head">Aktionen</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${person}" var="person">
        <tr>
            <td><c:out value="${person.firstName}"> </c:out></td>
            <td><c:out value="${person.lastName}"> </c:out></td>
            <td><c:out value="${person.street}"> </c:out></td>
            <td><c:out value="${person.zipCode}"> </c:out></td>
            <td><c:out value="${person.city}"> </c:out></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>