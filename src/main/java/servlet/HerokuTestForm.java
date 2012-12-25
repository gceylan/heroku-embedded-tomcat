
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test-servlet")
public class HerokuTestForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");

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

}
