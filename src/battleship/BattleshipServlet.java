package battleship;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

///import java.util.Date;

@WebServlet (
        name="Battleship Servlet",
        urlPatterns={"/start"}
)

public class BattleshipServlet extends HttpServlet {

    Battleship battleship;
    Player computer;

    String paramStatus;

    public void init() throws ServletException {

        battleship = new Battleship();

    }
/*
    //Use in place of doGet ?
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        paramStatus = request.getParameterMap().containsKey("status") ? request.getParameter("status") : "";

        if (paramStatus.equals("play")) {

            //javaBean.setPageTitle("Play 2");

            log("true " + paramStatus);
        }
        else {
            log("false " + paramStatus);


            //javaBean.setPageTitle("Java Battleship v" + (int)((Math.random() * 10) + 1));

            //javaBean.setPageTitle(paramStatus + (int)((Math.random() * 10) + 1));

            //computer = new Player();
            //battleship.setupComputer(computer);
            //computer.playerGrid.printShips();
        }

        //BattleshipJavaBean javaBean = new BattleshipJavaBean();

        //doGet(request, response);


    }
*/

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BattleshipJavaBean javaBean = new BattleshipJavaBean();


        paramStatus = request.getParameterMap().containsKey("status") ? request.getParameter("status") : "";

        if (paramStatus.equals("play")) {

            //javaBean.setPageTitle("Submit Coordinates");

        }
        else {

            //javaBean.setPageTitle(paramStatus + (int)((Math.random() * 10) + 1));

            computer = new Player();
            battleship.setupComputer(computer);

            computer.playerGrid.printShips();

        }

        request.setAttribute("pageTitleBean", javaBean);

        //String url = "/index.jsp?status=" + request.getParameter("status");
        String url = "/index.jsp?status=" + request.getParameter("status");

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);

        dispatcher.forward(request, response);


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