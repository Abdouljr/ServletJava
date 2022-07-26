package com.maiga.connexion;

import jakarta.servlet.http.HttpServletRequest;

public class Connexion {
	
	private String resultat;
	
	public void verifierIndentifiant(HttpServletRequest request) {
		String mdp = request.getParameter("mdp");
		String mdp2 = request.getParameter("mdp2");
		
		if(mdp.equals(mdp2)) {
			resultat = "Vous êtes bien connecter !";
		}else {
			resultat = "Mot de passe Incorrecte !";
		}
	}

	
	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	

}
