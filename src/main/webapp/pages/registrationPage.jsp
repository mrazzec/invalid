<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>

<table>
    <form action="/registration" method="post">

        <tr>
            <td>User name:</td>
            <td>
                <input type="text" name="user_name" placeholder="Enter Name...">
            </td>
        </tr>

        <tr>
            <td>User login:</td>
            <td>
                <input type="text" name="user_login" placeholder="Enter login...">
            </td>
        </tr>

        <tr>
            <td>User password:</td>
            <td>
                <input type="password" name="user_password" placeholder="Enter password...">
            </td>
        </tr>

        <tr>
            <td colspan="2" align="right">
                <input type="submit" name="submit_register" value="Ok">
            </td>
    </form>
    <form action="/pages/main.jsp">
        <td colspan="1" align="left">
            <input type="submit" name="submit_return" value="Return">
        </td>
    </form>
    </tr>

</table>

</body>
</html>
