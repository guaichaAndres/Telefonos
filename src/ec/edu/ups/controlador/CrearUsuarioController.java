package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;

@WebServlet("/CrearUsuarioController")
public class CrearUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDAO usuarioDao;
	private Usuario usuario;
	
	public CrearUsuarioController() {
		usuarioDao = DAOFactory.getFactory().getPersonaDAO();
		usuario = new Usuario();
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String url = null;
		try {
			usuario.setId(Integer.valueOf(request.getParameter("id")));
			usuario.setCedula(request.getParameter("cedula"));
			usuario.setNombre(request.getParameter("nombre"));
			usuario.setApellido(request.getParameter("apellido"));	
			usuario.setCorreo(request.getParameter("correo"));			
			usuario.setContrasena(request.getParameter("contrasena"));			
			usuarioDao.create(usuario);			
			
			url = "/index.html";
		} catch (Exception e) {
			url = "/JSPs/error.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);		
	}

}
