package aboutme;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charSet=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>몇시에요?</title>");
		out.println("<style>");
		out.println(".styling{text-align: center; margin-top: 150px;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<a href=\"http://localhost:8080/aboutme/index.html\">메인화면</a>");
		LocalDateTime currentDate = LocalDateTime.now();
		out.println("<h1 class=\"styling\">현재시간 : " + currentDate + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
