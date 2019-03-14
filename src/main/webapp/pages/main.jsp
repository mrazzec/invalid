<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<table>
    <form action="/login" method="post">

        <tr>
            <td>Login:</td>
            <td>
                <input type="text" name="user_login">
            </td>
        </tr>

        <tr>
            <td>Password:</td>
            <td>
                <input type="text" name="user_password">
            </td>
        </tr>

        <tr>
            <td colspan="2" align="right">
                <input type="submit" value="Ok" name="submit_ok" />
            </td>
        </tr>

    </form>

    <form action="pages/registrationPage.jsp">
        <td colspan="3" align="left">
            <input type="submit" value="Registration" />
        </td>
    </form>
</table>
<h1>List of users: </h1>
<c:forEach var="operation" items="${applicationScope.users}">
    <li><c:out value="${operation}"/></li>
</c:forEach>
</body>
</html>
