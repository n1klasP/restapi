<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="utf-8">
</head>

<%-- Dies ist ein JSP Kommentar --%>

<body>

<%-- <c:forEach> -------------------------------------------------------------------------------------------------- --%>
<ul>
    <c:forEach items="${stringList}" var="item">
        <li>${item}</li>
    </c:forEach>
</ul>

<br/>

<%-- <c:choose> ------------------------------------------------------------------------------------------------------%>
<ul>
    <c:forEach items="${stringList}" var="item">
            <c:choose>
                <c:when test="${item == 'one'}">
                    <li style="color: red">${item}</li>
                </c:when>

                <c:when test="${item eq 'two'}">
                    <li style="color: blue">${item}</li>
                </c:when>

                <c:otherwise>
                    <li>${item}</li>
                </c:otherwise>
            </c:choose>
        </li>
    </c:forEach>
</ul>

<%-- ${fn:length() ------------------------------------------------------------------------------------------------ --%>
<c:set var="listSize" value="${fn:length(stringList)}" />

<p>Die Liste hat ${listSize} Elemente.</p>

<c:if test="${listSize > 0}">
    <p>Die Liste ist nicht leer.</p>
</c:if>
<c:if test="${listSize == 0}">
    <p>Die Liste ist leer.</p>
</c:if>

<%-- Fragezeichenoperator ----------------------------------------------------------------------------------------- --%>
<p>Die Anzahl der Elemente ist ${(listSize % 2 == 0) ? "gerade" : "ungerade"}.</p>

<%-- <c:out> ------------------------------------------------------------------------------------------------------ --%>
<c:out value="<script type=\"text/javascript\">alert(\"XSS\");</script>" />
<%--<script type="text/javascript">alert("XSS");</script>--%>

<%-- TODO ------------------------------------------------------------------------------------------------------ --%>

</body>
</html>