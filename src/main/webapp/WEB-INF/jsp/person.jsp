<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="de">
<head>
</head>

<body>
<style type="text/css">
    .tg  {border-collapse:collapse;border-spacing:0;}
    .tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
        overflow:hidden;padding:10px 5px;word-break:normal;}
    .tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
        font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
    .tg .tg-c3ow{border-color:inherit;text-align:center;vertical-align:top}
    .tg .tg-7btt{border-color:inherit;font-weight:bold;text-align:center;vertical-align:top}
    .tg .tg-0pky{border-color:inherit;text-align:left;vertical-align:top}
</style>
<table class="tg">
    <thead>
    <tr>
        <th class="tg-7btt">Vorname</th>
        <th class="tg-7btt">Nachname</th>
        <th class="tg-7btt">Strasse</th>
        <th class="tg-7btt">Postleitzahl</th>
        <th class="tg-c3ow"><span style="font-weight:bold">Stadt</span></th>
        <th class="tg-0pky"><span style="font-weight:bold">Aktionen</span></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${person}" var="person"><tr>
        <td>${person.firstName}</td>
        <td>${person.lastName}</td>
        <td>${person.street}</td>
        <td>${person.zipCode}</td>
        <td>${person.city}</td>
    </tr></c:forEach>
    </tbody>
</table>
</body>
</html>