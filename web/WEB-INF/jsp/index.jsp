<%-- 
    Document   : content
    Created on : 7 nov. 2011, 15:21:11
    Author     : Quentin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <h3>Formulaire de connexion</h3>

        <div>
            <form action="LoginServlet" method="post">
                login : <input type="text" name="login" />
                password : <input type="password" name="password" />
                <input type="submit" value="connexion" />
            </form>
        </div>
    </body>
</html>
