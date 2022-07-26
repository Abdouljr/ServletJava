<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Connexion</title>
<style>
	body{
	padding: 0px;
	margin: 0px;
	}
	fieldset{
	margin-top: 10%;
	width: 310px;
	box-shadow: 5px 5px 20px 1px 10px rgb(85 85 85);
	}
</style>
</head>
<body>
	<center>
		<fieldset style="width:30%">
		<form method="Post" action="MonServletJsp">
			<h1>Connexion</h1>
			<table>
				<tr>
					<td>Pseudo</td><td><input type="text" name="pseudo" value=""></td>
				</tr>
				<tr>
					<td>Mot De Passe</td><td><input type="password" name="pass" value=""><br><br></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="" value="Se Connecter"></td>
				</tr>
			</table>		
		</form>	
	</fieldset>
	</center>

</body>
</html>