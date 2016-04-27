<%-- 
    Document   : UserOutput
    Created on : 01-Mar-2016, 14:47:36
    Author     : Zohra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><title>Udregning af sum</title></head>
    <h1>Summen af dine to indtastede tal</h1>
    <body>
        <% 
            int  a =Integer.parseInt(request.getParameter("Tal 1"));
            int b=Integer.parseInt(request.getParameter("Tal 2"));
            out.println(a +" "+ "+" +" "+ b + " "+ "=" +" "+(a+b));          
        %>
    </body>
</html>
