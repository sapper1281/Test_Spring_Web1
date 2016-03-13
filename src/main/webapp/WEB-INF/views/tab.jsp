<%-- 
    Document   : tab
    Created on : 13.03.2016, 12:53:26
    Author     : александр
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Spittr</title>
</head>
<body>
<h1>Welcome to Spittr1 ${tabList}</h1>
 <c:forEach items="${tabList}" var="document">
        <tr id="document_<c:out value="${document.id}"/>">
            <td>
                <c:out value="${document.name}"/>
            </td> 
    </td>
</tr>
</c:forEach>

</body>
</html>