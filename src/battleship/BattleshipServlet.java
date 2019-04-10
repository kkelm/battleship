package battleship;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;

///import java.util.Date;

@WebServlet (
        name="Battleship Servlet",
        urlPatterns={"/start"}
)

public class BattleshipServlet extends HttpServlet {

    public void init() throws ServletException {}

    //Use in place of doGet ?
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BattleshipJavaBean javaBean = new BattleshipJavaBean();

        javaBean.setPageTitle("Java Battleship");
        request.setAttribute("pageTitleBean", javaBean);

        String url = "/index.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);

        dispatcher.forward(request, response);

    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*

        javaBean.setPageTitle("Battleship");

        request.setAttribute("pageTitleBean", javaBean);

        String url = "/index.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
        */

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