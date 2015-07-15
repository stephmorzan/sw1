package sw1.servlets;

import sw1.connector.DataBaseController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by smorzán on 14/07/2015.
 */
@WebServlet(name = "Welcome", urlPatterns = {"/welcome"})
public class welcome extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession ses = request.getSession(true);
        ses.setAttribute("accesos", DataBaseController.getInstance().getAllAccesos());
        response.sendRedirect("welcome.jsp");
    }
}
