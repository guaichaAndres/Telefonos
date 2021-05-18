package ec.edu.ups.sessions;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.mysql.jdbc.JDBCUsuarioDAO;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario user = new Usuario();
		JDBCUsuarioDAO userdao = new JDBCUsuarioDAO();
		//HttpSession sesion = request.getSession();
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		user= userdao.read(password);
		
		
		if (user!=null && usuario.equals(user.getCorreo()) && password.equals(user.getContrasena())){
			HttpSession sesion = request.getSession(true);
			sesion.setAttribute("nombre", user.getNombre());
			sesion.setAttribute("cedula", user.getCedula());
			sesion.setAttribute("clave", password);
			System.out.println("sesion TRUE");
			RequestDispatcher d = getServletContext().getRequestDispatcher("/indexInterno.jsp");
			d.forward(request, response);
		}else {
			HttpSession sesion = request.getSession(false);
			System.out.println("sesion FALSE");
			RequestDispatcher d = getServletContext().getRequestDispatcher("/JSPs/errorLogin.jsp");
			d.forward(request, response);
			
		}
	}

}
