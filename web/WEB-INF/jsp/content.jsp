<%-- 
    Document   : content
    Created on : 7 nov. 2011, 15:21:11
    Author     : Quentin
--%>

<%@page import="POJO.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Content</title>
    </head>
    <body>
        <%
            if (request.getSession().getAttribute("user") == null) {
                out.print("Vous n'êtes pas connecté. Cliquez <a href=\"/WEB-INF/jsp/index.jsp\">ici</a> pour vous authentifier");

            } else {
                User currentUser = (User) request.getSession().getAttribute("user");
                out.print(String.format("Bonjour visiteur ! Tu es connecté en tant que : %s", currentUser.getLoginUser()));
                out.print("<br />");
                out.print(String.format("Ton mot de passe est : %s", currentUser.getMdpUser()));
                out.print("<p><a href=\"LogoutServlet\">Déconnexion</a></p>");
            }
        %>
    </body>
</html>
