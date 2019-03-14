package by.dorozhuk.javaee.servlet;

import by.dorozhuk.javaee.entity.User;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final String LOGIN = "user_login";
    private static final String PASSWORD = "user_password";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context=getServletContext();

        String login = req.getParameter(LOGIN);
        String password = req.getParameter(PASSWORD);

        User user = new User(login, password);

        Object users = context.getAttribute("users");
        List<User> userList = (ArrayList<User>) users;
        if (userList.contains(user)){
            req.setAttribute("uname", login);
            req.getRequestDispatcher("/pages/afterLoginSuccess.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("/pages/afterLoginFail.jsp");
        }

    }
}
