<%@ page import="battleship.Battleship" %>
<%@ page import="battleship.Player" %>
<%@ include file="template/header.jsp" %>


<%
    Battleship battleship = new Battleship();

    Player computer = new Player();
    battleship.setupComputer(computer);

    computer.playerGrid.printShips();
%>


<%@ include file="template/footer.jsp" %>