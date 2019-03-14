package by.dorozhuk.javaee.servlet;

import by.dorozhuk.javaee.entity.User;
import by.dorozhuk.javaee.entity.UserWrapper;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/")
public class IndexServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        getServletContext().setAttribute("users", UserWrapper.users);
        req.getRequestDispatcher("pages/main.jsp").forward(req, res);
    }
}
