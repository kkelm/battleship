<%@ include file="template/header.jsp" %>


<form action="/battleship/start" method="get">


    Enter A-J: <input type="text" id="yCoord" name="yCoord" value="" /><br />

    Enter 1-10: <input type="text" id="xCoord" name="xCoord" value="" /><br />

    <input type="submit" name="submitButton" value="Submit" />


</form>
<!--
<a href="/battleship/start" class="btn btn-primary">Start New Game</a>
-->

<%@ include file="template/footer.jsp" %>