package fr.formation.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.formation.Utilisateur;
import fr.formation.UtilisateurDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
			
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		HttpSession session=request.getSession();
		
		Utilisateur user = UtilisateurDAO.getByEmail(email);
		if(user==null) {
			//rediriger une page d'erreur
			response.sendRedirect("errorlogin.html");
		} else {
			if(user.getPassword().equals(password)) {
				//rediriger vers la page index.jsp
			response.sendRedirect("bonjour.jsp");
			session.setAttribute("email", email);
			} else {
				//rediriger une page d'erreur
			response.sendRedirect("errorlogin.html");
			}
		}
		
	}

}
