

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RqSample
 */
public class RqSample extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RqSample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		// nameパラメータ取得
		out.println("<h2>名前</h2>");
		out.println(request.getParameter("name") + "<br>");
		// addressのパラメータ取得
		out.println("<h2>住まい</h2>");
		out.println(request.getParameter("address") + "<br>");
		out.println("</html>");
		out.println("</body>");
	}

}
