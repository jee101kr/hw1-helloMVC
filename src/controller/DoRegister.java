package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		CustomerService service = (CustomerService) CustomerService.getInstance();
		//Customer customer = service.login(id, password);
		Customer customer = new Customer();
		
		String page;
		
		customer.setId(id);
		customer.setPassword(password);
		customer.setName(name);
		customer.setGender(gender);
		customer.setEmail(email);
		service.addCustomer(customer);
		
		page ="/view/registerSuccess.jsp";
		
		request.setAttribute("id", id);
		request.setAttribute("password", password);
		request.setAttribute("name", name);
		request.setAttribute("gender", gender);
		request.setAttribute("email", email);
			
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}
}
