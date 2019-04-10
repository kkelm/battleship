<%@ include file="template/header.jsp" %>

<center>
<form action="/battleship/start" method="get">


    <span>Enter A-J: </span><input style="color:white" type="text" id="yCoord" name="yCoord" value="" /><br />

    <span>Enter 1-10: </span><input type="text" id="xCoord" name="xCoord" value="" /><br />

    <input type="submit" name="submitButton" value="Submit" />


</form>
</center>
<!--
<a href="/battleship/start" class="btn btn-primary">Start New Game</a>
-->

<%@ include file="template/footer.jsp" %>
