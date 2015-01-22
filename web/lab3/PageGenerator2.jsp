<%-- 
    Document   : PageGenerator2
    Created on : Jan 22, 2015, 2:05:54 PM
    Author     : mdufek1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%    
    String color = request.getParameter("color");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1 style="color:<%= color %>;">This is a JSP generated page!</h1>
        
        <table border='1' style='margin-top:20%; position:relative;'>
            <%
                for (int i = 0; i < 3; i++) {
                    out.println("<tr>");
                    for (int o = 0; o < 3; o++) {
                        out.println("<td>This is Column " + (o + 1) + " of Row " + (i + 1) + " !</td>");
                    }
                    out.println("</tr>");
                }
            %>
        </table>
    </center>
    </body>
</html>
