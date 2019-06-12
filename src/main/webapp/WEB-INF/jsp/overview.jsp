<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <meta charset="utf-8">
</head>

<body>
<h1>Übersicht</h1>

<br/>
<br/>

<table style="width:100%">
    <tr>
        <%--TODO: Localize--%>
        <th style="text-align: left;">Vorname</th>
        <th style="text-align: left;">Nachname</th>
        <th style="text-align: left;">Straße</th>
        <th style="text-align: left;">Postleitzahl</th>
        <th style="text-align: left;">Stadt</th>
        <th style="text-align: left;">Aktionen</th>
    </tr>

    <c:forEach items="${persons}" var="person" varStatus="status">
        <tr style="background-color: ${status.index % 2 == 0 ? '#dddddd' : '#ffffff'}">
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
            <td>${person.street}</td>
            <td>${person.zipCode}</td>
            <td>${person.city}</td>
            <td>
                <c:url value="/person/${person.id}" var="targetURL" />
                <a href="${targetURL}">Bearbeiten</a>
            </td>
        </tr>
    </c:forEach>
</table>


</body>
</html>