<%@ include file="/WEB-INF/jsp/include.jsp" %> 

<html>
    <head><title>Login</title></head>
    <body>
    <center>

        <h3>Login page</h3>
        <br/>
        
        <form:form commandName="login" method="POST" name="login">
        
        <font color="red"><form:errors/></font>
        <br/><br/>
        	
            Username:<form:input path="username"/> <font color="red"><form:errors path="username"/></font><br/><br/>
            Password:<form:password path="password"/><font color="red"><form:errors path="password"/></font><br/><br/>
            <input type="submit" value="Login"/>
        </form:form>
    </center>

</body>
</html>
