<%@ page session="false"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>Accueil</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<style type="text/css">
.center_frame {
	border-style: none;
	width: 798px;
	height: 423px;
}
.width-20 {
	width: 20%;
}
.width-30 {
	width: 30%;
}
.width-40 {
	width: 40%;
}
.width-60 {
	width: 60%;
}
.right_top_div {
	vertical-align: middle;
	font-family: Georgia, "Times New Roman", Times, serif;
	padding-bottom: 10px;
}
#title_div {
	text-align: center;
	font-size: x-large;
	font-family: Georgia, "Times New Roman", Times, serif;
}
.menu_list {
	width: 100%;
	list-style-type: none;
	margin: 0;
	padding: 0;
	background-color: #019CDE;
}
.menu_list li
{
	width: 180px;
	float: left;
	margin: 0 10% 0 0;
	padding: 0;
	border: 0;
	background-color: #019CDE;
}

.menu_list li a:link, .menu_list li a:visited
{
	display: block;
	color: #FFF;
	background: #019CDE;
	margin: 0;
	text-decoration: none;
}
.menu_list li a:hover { background-color: #3B4E77; }
.menu_list li a:active { background-color: #5F879D; }
 
.menu_btn {
	height: 45px;
	font-family: "Comic Sans MS";
	font-size: x-large;
	text-align: center;
	display: table-cell;
	vertical-align: middle;
	color: #000000;
	font-weight: normal;
	font-variant: normal;
	text-transform: none;
}
.menu_list_div {
	height: 45px;
	background-color: #019CDE;
}

.central_iframe {
	width: 800px;
	height: 427px;
}

#main_div {
	background-color: #FFFFFF;
	width: 800px;
}

.bottom_content {
	font-family: Georgia, "Times New Roman", Times, serif;
	width: 400px;
	text-align: center;
	text-decoration: none;
}

</style>
</head>
<body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<!-- Save for Web Slices (Accueil.psd) -->
<center>
<div id="main_div">
	<table id="Tableau_01" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td class="width-20" style="height:75px"><img src="images/polytech.png"></td>
			<td class="width-60">
				<div id="title_div">
					<span>APOCAM 404</span>
				</div>
			</td>
			<td class="width-20">
				<div class="right_top_div">
                                    <span id="user_name"><core:out value="${name}"/></span>			
				</div>
				<div class="right_top_div">
					<span id="my_teaching_btn">Mes Enseignements</span>			
				</div>
			</td>
		</tr>
	</table>
	<div class="menu_list_div">
	    <ul class="menu_list">
	   		<li>
	   			<a href="#" class="menu_btn">Etudiants</a>
	  	  	</li>
	  	  	<li>
		  		<a href="#" class="menu_btn">Enseignants</a>
		   	</li>
	  	  	<li>
                                <a href="#" class="menu_btn">Enseignements</a>
	   		</li>	       
	    </ul>
	</div>
	<div class="central_iframe">
			<iframe class="center_frame" src="iframe.html">
			</iframe>
	</div>
</div>
<div style="padding-top:10px">
	<table class="bottom_content">
		<tr>
			<td><a href="#">A Propos</a></td>
			<td><a href="#">Aide</a></td>
			<td><a href="#">Contact</a></td>
		</tr>
	</table>
</div>
</center>
<!-- End Save for Web Slices -->
</body>
</html>
