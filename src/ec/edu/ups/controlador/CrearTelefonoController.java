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
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.mysql.jdbc.JDBCUsuarioDAO;

@WebServlet("/CrearTelefonoController")
public class CrearTelefonoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TelefonoDAO telefonoDao;
	private Telefono telefono;
	
	public CrearTelefonoController() {
		telefonoDao = DAOFactory.getFactory().getTelefonoDAO();
		telefono = new Telefono();
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	
			throws ServletException, IOException {
		Usuario user = new Usuario();
		JDBCUsuarioDAO userdao = new JDBCUsuarioDAO();
		user= userdao.read((String) request.getSession().getAttribute("clave"));
		System.out.println(user); 
		String url = null;
		
		try {
			
				telefono.setNumero(Integer.parseInt(request.getParameter("numero")));
				telefono.setUsuarioTelefono(user);
				telefono.setTipo(request.getParameter("tipo"));
				telefono.setOperadora(request.getParameter("operadora"));				
				telefonoDao.create(telefono);						
				url = "/index.html";
			
		
		} catch (Exception e) {
			url = "/JSPs/error.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);		
	}

}
