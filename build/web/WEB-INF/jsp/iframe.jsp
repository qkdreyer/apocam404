<%-- 
    Document   : iframe
    Created on : 9 nov. 2011, 18:08:44
    Author     : Tyty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>sans titre 1</title>
<style type="text/css">
.width-50 {
	width: 50%;
}

.width-100 {
	width: 100%;
}
.select_list {
	height: 127px;
	overflow: auto;
	overflow-x: hidden;
	overflow-y: scroll;
	border: 1px solid #8DAEC7;
	list-style-type: none;
	margin-top: 10px;
	-webkit-padding-start: 10px;
}
#validate_btn {
	float: right;
	padding-left: 10%;
}

</style>
</head>

<body>
	<form action="" method="get">
		<table style="width:100%">
			<tr>
				<td class="width-50">
					<select class="select_list width-100" size="5">
					  <option>IG</option>
					  <option>ERII</option>
					  <option>MAT</option>
					  <option>MEA</option>
					  <option>STE</option>
					  <option>STIA</option>
					  <option>MI</option>
					  <option>FQSC</option>
					</select> 
				</td>
				<td class="width-50">
					<select class="select_list width-100" size="5">
					  <option>3ième Année</option>
					  <option>4ième Année</option>
					  <option>5ième Année</option>
					</select> 
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<div id="validate_btn">
						<input type="submit" value="Submit" />
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>

</html>
