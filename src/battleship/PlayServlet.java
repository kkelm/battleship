package battleship;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

///import java.util.Date;

@WebServlet (
        name="Play Battleship Servlet",
        urlPatterns={"/play"}
)

public class PlayServlet extends BattleshipServlet {

    public void init() throws ServletException {}

    public void doGet(Player player, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BattleshipJavaBean javaBean = new BattleshipJavaBean();


        //BattleshipServlet battleshipServlet = new BattleshipServlet();

        javaBean.setPageTitle("Now Playing Java Battleship");
        request.setAttribute("pageTitleBean", javaBean);


        //BattleshipServlet battleshipServlet = new BattleshipServlet();

        //battleshipServlet.computer.playerGrid.printShips();

        /*
        javaBean.setComputer(computer);
        request.setAttribute("playerComputer", javaBean);

        javaBean.setBattleship(battleship);
        request.setAttribute("battleshipGame", javaBean);
        */




        String url = "/battleship.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);


    }

}