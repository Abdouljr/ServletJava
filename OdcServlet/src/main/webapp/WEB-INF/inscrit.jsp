<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>
<style>
	body{
	padding: 0px;
	margin: 0px;
	}
	fieldset{
	margin-top: 70px;
	width: 310px;
	box-shadow: 5px 5px 20px 1px 10px rgb(85 85 85);
	}
</style>
</head>
<body>
	<center>
	<fieldset>
		<form method="post" action="MonServletJsp2">
			<h1>Inscrivez-vous</h1>
			<table>
				<tr>
					<td>Nom:</td><td><input type="text" name="nom" value=""><br><br></td>
				</tr>
				<tr>
					<td>Prénom:</td><td><input type="text" name="prenom" value=""><br><br></td>
				</tr>
				<tr>
					<td>Pseudo:</td><td><input type="text" name="psd" value=""><br><br></td>
					
				</tr>
				<tr>
					<td>Email:</td><td><input type="email" name="email" value=""><br><br></td>
				</tr>
				<tr>
					<td>Mot de passe:</td><td><input type="password" name="mdp" value=""><br><br></td>
				</tr>
				<tr>
					<td>Confirmer:</td><td><input type="password" name="mdp2" value=""><br><br></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" id="submit" name="" value="S'inscrit"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	</center>
</body>
</html>