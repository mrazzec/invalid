package by.dorozhuk.javaee.servlet;

import by.dorozhuk.javaee.entity.User;
import by.dorozhuk.javaee.entity.UserWrapper;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    private static final String LOGIN_PARAM = "user_login";
    private static final String PASSWORD_PARAM = "user_password";
    private static final String NAME_PARAM = "user_name";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter(LOGIN_PARAM);
        String password = req.getParameter(PASSWORD_PARAM);
        String name = req.getParameter(NAME_PARAM);
        User user = new User(login, password, name);
        req.setAttribute("user", user);
        UserWrapper.users.add(user);
        req.getRequestDispatcher("/pages/afterRegistrationSuccess.jsp").forward(req, resp);

    }
}
