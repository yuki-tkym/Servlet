

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Servlet implementation class ExeAnnotation2
 */

@WebListener()
public class ExeAnnotation2 extends HttpServlet implements HttpSessionListener {
	private static final long serialVersionUID = 1L;
	private static int sesCount = 0;

	@Override
	public void sessionCreated(HttpSessionEvent hse) {
		sesCount++;
		ServletContext sc = hse.getSession().getServletContext();
		sc.log("Session Count is :" + sesCount);
	}

	public void sessionDestroyed(HttpSessionEvent hse) {
		sesCount--;
		ServletContext sc = hse.getSession().getServletContext();
		sc.log("Session Count is :" + sesCount);
	}

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExeAnnotation2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 日本語表示設定
		response.setContentType("text/html; charset=Windows-31J");
		HttpSession hs = request.getSession();

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("session生成");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
