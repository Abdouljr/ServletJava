package com.maiga.MonServletJsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.maiga.connexion.Connexion;

public class MonServletJsp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MonServletJsp() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String psd = request.getParameter("pseudo");
		String pass = request.getParameter("pass");

		
		if (psd.isEmpty() || pass.isEmpty()) {
			
			request.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
		}else{
			request.setAttribute("psd", psd);
			request.setAttribute("pass", pass);			
			
			request.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
			//doGet(request, response);
		}
	}

}
