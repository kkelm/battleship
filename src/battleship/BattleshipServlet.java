package battleship;

import java.io.*;
///import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet (
        name="Battleship Servlet",
        urlPatterns={"/start"}
)

public class BattleshipServlet extends HttpServlet {

    public void init() throws ServletException {}

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        BattleshipJavaBean javaBean = new BattleshipJavaBean();

        javaBean.setPageTitle("Battleship");

        request.setAttribute("pageTitleBean", javaBean);

        String url = "/index.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

        /*

        request.setAttribute("templateHeader", this.getHeaderTemplate("Demo Servlet"));

        request.setAttribute("templateFooter", this.getFooterTemplate());

        //request.setAttribute("hashMap", map);

        String url = "/demo.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);

        dispatcher.forward(request, response);
        */

    }

}