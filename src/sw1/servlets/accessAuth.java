package sw1.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by EQ on 15/06/2015.
 */
@WebServlet(name = "accessAuth")
public class accessAuth extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String acceso = request.getParameter("acceso");

        HttpSession ses = request.getSession(true);


        ses.setAttribute("acceso", acceso);

        RequestDispatcher rd = request.getRequestDispatcher("/autorizadores.html");
        rd.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
