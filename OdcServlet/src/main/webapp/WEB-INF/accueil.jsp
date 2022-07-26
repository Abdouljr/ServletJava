<%@page import="java.util.ArrayList"%>
<%@page import="com.maiga.connexion.Personnes"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenu sur mon Site Web</title>
</head>
<body>
	<h1>Bienvenomnue sur mon Site Web</h1>
	<p>Bienvenue, Vous vous appelez "${psd}"</p>
	<p>${connecter.resultat}</p>
	

	
	<% HttpSession sessions = request.getSession();
	List<Personnes> utilisateurs =  (ArrayList<Personnes>)session.getAttribute("liste");
	%>

	
	 <table>
	 	<h2>Listes des utilisateurs</h2>
	 	<thead>
	 		<tr>
	 			<td>Nom</td>
	 			<td>Prenom</td>
	 			<td>Email</td>
	 		</tr>
	 	</thead>
	 	
	 	<tbody>
	 		<%for (Personnes user:utilisateurs){ %>
	 		
	 			<tr>
	 				<td><%=user.getNom() %> </td>
	 				<td><%=user.getPrenom() %> </td>
	 				<td><%=user.getEmail() %> </td>
	 			</tr>
	 		
	 		<%} %>
	 	</tbody>
	 </table>
	
	%>
</body>
</html>