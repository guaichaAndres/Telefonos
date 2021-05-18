package ec.edu.ups.controlador;



import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Telefono;

/**
 * Servlet implementation class ListarPersonaController
 */
@WebServlet("/ListarTelefonoUsuarioController")
public class ListarTelefonoUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TelefonoDAO telefonoDao;
	private List<Telefono> listaTelefono;
	

	public ListarTelefonoUsuarioController() {
		telefonoDao = DAOFactory.getFactory().getTelefonoDAO();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = null;
		try {
			
			listaTelefono = telefonoDao.listarCedula(request.getParameter("cedula"));
			System.out.println("Tamaño de la lista recuperada: " + listaTelefono.size());
			request.setAttribute("telefonos", listaTelefono);
			url = "/JSPs/listar_telefono_usuario.jsp";
		} catch (Exception e) {
			url = "/JSPs/error.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
