package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Telefono;

/**
 * Servlet implementation class BuscarPersonaController
 */
@WebServlet("/BuscarTelefonoController")
public class BuscarTelefonoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TelefonoDAO telefonoDao;
	private Telefono telefono;

	public BuscarTelefonoController() {
		telefonoDao = DAOFactory.getFactory().getTelefonoDAO();
		telefono = new Telefono();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = null;
		try {
			int numero = Integer.valueOf(request.getParameter("numero"));
			telefono = telefonoDao.read(numero);
			if (telefono==null){
				url = "/JSPs/noEncontrado.jsp";

			}else {
				request.setAttribute("telefono", telefono);
				url = "/JSPs/buscar_telefono.jsp";
			}
			
		} catch (Exception e) {
			url = "/JSPs/error.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
