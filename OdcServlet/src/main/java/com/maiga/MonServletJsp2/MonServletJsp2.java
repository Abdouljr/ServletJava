package com.maiga.MonServletJsp2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.maiga.connexion.Connexion;
import com.maiga.connexion.Personnes;

/**
 * Servlet implementation class MonServletJsp2
 */
public class MonServletJsp2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MonServletJsp2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getServletContext().getRequestDispatcher("/WEB-INF/inscrit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String psd = request.getParameter("psd");
		String email = request.getParameter("email");
		String mdp = request.getParameter("mdp");
		String mdp2 = request.getParameter("mdp2");

		HttpSession session = request.getSession();
		
		List<Personnes> users = (ArrayList<Personnes>) session.getAttribute("liste");
		
		if(session.getAttribute("liste") == null) {
			users = new ArrayList<>();
		}
		
		Personnes u = new Personnes(nom,prenom,email);	
		
		users.add(u);
		session.setAttribute("utilisateurs",u);
		session.setAttribute("liste", users);
		request.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);

		
//		if (nom.isEmpty() || prenom.isEmpty() || psd.isEmpty() || mdp.isEmpty() || mdp2.isEmpty()) {
//			
//			request.getServletContext().getRequestDispatcher("/WEB-INF/inscrit.jsp").forward(request, response);
//		}else{
//			request.setAttribute("nom", nom);
//			request.setAttribute("prenom", prenom);
//			request.setAttribute("psd", psd);
//			request.setAttribute("email", email);
//
//			
//			
//			Connexion con = new Connexion();
//			con.verifierIndentifiant(request);
//			request.setAttribute("connecter", con);
//			
//			request.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
//			//doGet(request, response);
//		}


	}
}
