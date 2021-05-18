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
 * Servlet implementation class EliminarPersonaController
 */
@WebServlet("/EliminarTelefonoController")
public class EliminarTelefonoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TelefonoDAO telefonoDao;
	private Telefono telefono;

	public EliminarTelefonoController() {
		telefonoDao = DAOFactory.getFactory().getTelefonoDAO();
		telefono = new Telefono();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = null;
		try {
			telefono.setNumero(Integer.valueOf(request.getParameter("numero")));			
			telefonoDao.delete(telefono);

			url = "/indexInterno.jsp";
		} catch (Exception e) {
			url = "/JSPs/error.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}
}
