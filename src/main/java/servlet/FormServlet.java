

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/form-servlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FormServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		out.println("<center>");
		out.println("<h2>FormServlet Result</h2>");
		out.println("<hr>");
		
		if (firstName != null && lastName != null) {
			if (firstName.trim().equals("") || lastName.trim().equals("")) {
				out.println("<p>Do not leave an empty parameters!!!</p>");
				return;
			}
			out.println("<p>First Name: " + firstName + "</p>");
			out.println("<p>Last Name: " + lastName + "</p>");
		} else {
			out.println("<p>No Result!!!</p>");
		}
		
		out.println("</center>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
