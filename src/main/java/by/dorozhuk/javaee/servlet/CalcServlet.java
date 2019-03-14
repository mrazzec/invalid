package by.dorozhuk.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String type = req.getParameter("type");
        if (num1 != null && num2 != null) {
            req.setAttribute("num1", num1);
            req.setAttribute("num2", num2);
            req.setAttribute("type", type);
            HttpSession session = req.getSession();
            session.setAttribute("list", new ArrayList<>());

            ArrayList<String> list = (ArrayList<String>) session.getAttribute("list");
            list.add(new Date().toString() + " " + num1 + " " + num2);
            session.setAttribute("list", list);
            if (type.equals("dif")){
                int result = Integer.parseInt(num1) - Integer.parseInt(num2);
                session.setAttribute("result", result);
            }else if (type.equals("sum")){
                int result = Integer.parseInt(num1) + Integer.parseInt(num2);
                session.setAttribute("result", result);
            }
            req.setAttribute("error", false);
            getServletContext().getRequestDispatcher("/pages/afterLoginSuccess.jsp").forward(req, res);
        }
        req.setAttribute("error", true);
        getServletContext().getRequestDispatcher("pages/error.jsp").forward(req, res);
    }
}
