
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/browser-insult")
public class BrowserInsult extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String title = null;
		String message = null;
		String userAgent = request.getHeader("User-Agent").toLowerCase();

		out.println("<center>");

		if (userAgent != null) {
			if (userAgent.contains("chromium")) {
				title = "Chromium";
				message = "Welcome to Chromium";
			} else if (userAgent.contains("chrome")) {
				title = "Chrome";
				message = "Welcome to Chrome";
			} else if (userAgent.contains("firefox")) {
				title = "Mozilla Firefox";
				message = "Welcome to Firefox";
			} else if (userAgent.contains("MSIE")) {
				title = "Microsoft IE";
				message = "Welcome to Microsoft IE";
			}
		} else {
			title = "No Value";
			message = "User-Agent: " + userAgent;
		}

		out.println("<p>" + message + "</p>");
		out.println("<p> (User Agent Inf: " + userAgent +")</p>");
		out.println("<center>");

	}

}
