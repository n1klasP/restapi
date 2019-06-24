<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="utf-8">
</head>

<body>
<%-- Dies ist ein JSP Kommentar --%>

<%-- <c:set> und <c:out> ------------------------------------------------------------------------------------------ --%>
<c:set var="var1" value="1" />
<p>Ausgabe1: ${var1}</p>
<p>Ausgabe2: <c:out value="${var1}"/></p>

<c:set var="var2">2</c:set>
<p>Ausgabe3: ${var2}</p>

<c:set var="var3" value="${var2 > 1}" />
<p>Ausgabe4: ${var3}</p>

<%-- c:out schützt auch vor Cross Site Scripting --%>
<c:out value="<script type=\"text/javascript\">alert(\"XSS\");</script>" />
<%--Zum Vergleich, folgendes einkommentieren:--%>
<%--<script type="text/javascript">alert("XSS");</script>--%>

<%-- <c:if> ------------------------------------------------------------------------------------------------------- --%>
<c:if test="${2 > 1}">
    <p>c:if: 2 ist größer als 1</p>
</c:if>

<c:if test="${2 < 1}">
    <p>c:if: 2 ist kleiner als 1</p>
</c:if>

<c:if test="${2 != 1}">
    <p>c:if: 2 ist ungleich 1</p>
</c:if>

<c:if test="${2 == 1}">
    <p>c:if: 2 ist gleich 1</p>
</c:if>

<c:if test="${not empty var2}">
    <p>var2 ist nicht leer</p>
</c:if>

<%-- Fragezeichenoperator ----------------------------------------------------------------------------------------- --%>
<p>Die Zahl 3 ist ${(3 % 2 == 0) ? "gerade" : "ungerade"}.</p>

<%-- <c:choose> --------------------------------------------------------------------------------------------------- --%>
<%-- Beachte: es erfolgt nur eine Ausgabe --%>
<c:choose>
    <c:when test="${2 > 1}">
        <p>c:choose: 2 ist größer als 1</p>
    </c:when>

    <c:when test="${2 < 1}">
        <p>c:choose: 2 ist kleiner als 1</p>
    </c:when>

    <c:when test="${2 != 1}">
        <p>c:choose: 2 ist ungleich 1</p>
    </c:when>

    <c:otherwise>
        <p>c:choose: 2 ist gleich 1</p>
    </c:otherwise>
</c:choose>

<%-- <c:forEach> -------------------------------------------------------------------------------------------------- --%>
<ul>
    <c:forEach var="i" begin="1" end="5">
        <li>i = ${i}</li>
    </c:forEach>
</ul>

<%-- Die Variable stringList kommt aus JspExamplesController --%>
<ul>
    <c:forEach items="${stringList}" var="item">
        <li>${item}</li>
    </c:forEach>
</ul>

<br/>

<%-- ${fn:length() ------------------------------------------------------------------------------------------------ --%>
<c:set var="listSize" value="${fn:length(stringList)}" />

<p>Die Liste hat ${listSize} Elemente.</p>

<c:if test="${listSize > 0}">
    <p>Die Liste ist nicht leer.</p>
</c:if>
<c:if test="${listSize == 0}">
    <p>Die Liste ist leer.</p>
</c:if>


<%-- Expression tag
     Hier lässt sich  direkt Java Code ausführen.
     Dieses Tag verwenden wir grundsätzlich nicht!
     --%>
<p>Aktuelles Datum: <%= new java.util.Date()  %></p>


</body>
</html>