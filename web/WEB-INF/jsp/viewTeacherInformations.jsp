<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<title>Teacher Informations</title>
	</head>	
	<body bgcolor="#EEEEEE">
		<center>
                    <p>Id : <core:out value="${id}"/><br />
                    Nom : <core:out value="${firstName}"/><br />
                    Prénom : <core:out value="${lastName}"/></p>
		</center>
	</body>
</html>

