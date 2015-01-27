<%-- 
    Document   : result
    Created on : Jan 25, 2015, 4:16:16 PM
    Author     : Mike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello!</title>
    </head>
    <body>
        <h2><a href='../index.html'>&#8592; Go back to index.</a></h2>
        <%
        // the getAttribute method returns a plain object, not a String or other type
        Object returnMessage = request.getAttribute("message");
        String message = null;
        // cannot cast if null
        if(returnMessage == null) {
            // do something so program doesn't crash, like
            // here we create a list with an error message
            returnMessage = "Something went wrong...";
        } else {
            // cast it
            returnMessage = (String)returnMessage;
        }
            out.print("<center><h1>"+returnMessage+"</h1></center>");
        
        // THIS CODE IS OVERLY COMPLICATED and FRAGILE!!!
        // See result2.jsp for a better way
    %>
    </body>
</html>
