<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>You entered as, ${uname}</h1>
<form action="/calc" method="post">
    <input name="num1" type="text">
    <input name="num2" type="text">
    <select name="type">
        <option value="sum">+</option>
        <option value="dif">-</option>

    </select>
    <button type="submit">OK</button>
</form>

<c:if test="${error}">
    <p>Ошибка</p>
</c:if>
<c:if test="${!error}">
    <p>Результат: <c:out value="${result}"/></p>
</c:if>
<ul>
    <c:set var="name" value="Simon"/>
    <c:forEach var="operation" items="${list}">
        <li><c:out value="${operation}"/></li>
    </c:forEach>
</ul>

</body>
</html>
