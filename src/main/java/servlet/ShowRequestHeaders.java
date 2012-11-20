
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowRequestHeaders
 */
@WebServlet("/show-request-headers")
public class ShowRequestHeaders extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowRequestHeaders() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<center>");

		out.println("<h2>Showing Request Headers</h2>");
		out.println("<hr>");

		out.println("<p>method: <b>" + request.getMethod() + "</b></p>\n");
		out.println("<p>request URI: <b>" + request.getRequestURI() + "</b></p>\n");
		out.println("<p>protocol: <b>" + request.getProtocol() + "</b></p>\n");

		out.println("<table>");
		out.println("<tr><th>#</th><th>Header Name</th><th>Header Value</th></tr>");

		Enumeration<String> requestHeaders = request.getHeaderNames();
		int i = 1;

		while (requestHeaders.hasMoreElements()) {
			String headerName = requestHeaders.nextElement();
			out.println("<tr>");
			out.print("<td>" + i++ + "</td>" +
					"<td>" + headerName + "</td>" +
					"<td>" + request.getHeader(headerName) + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</center>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
