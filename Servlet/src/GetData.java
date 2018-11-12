

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetData
 */
public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ServletContext sc = getServletContext();

		Enumeration eReq = request.getAttributeNames();
		Enumeration eSes = session.getAttributeNames();
		Enumeration eApp = sc.getAttributeNames();

		response.setContentType("text/html; charset=Windows-31J");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>リクエスト固有の情報</h2>");
		while ( eReq.hasMoreElements()) {
			String keyReq = (String) eReq.nextElement();
			out.println( keyReq + "：" + request.getAttribute(keyReq) + "<br>");
		}

		out.println("<h2>セッション固有の情報</h2>");
		while ( eSes.hasMoreElements()) {
			String keySes = (String) eSes.nextElement();
			out.println( keySes + "：" + session.getAttribute(keySes) + "<br>");
		}

		out.println("<h2>アプリ固有の情報</h2>");
		while ( eApp.hasMoreElements()) {
			String keyApp = (String) eApp.nextElement();
			out.println( keyApp + "：" + sc.getAttribute(keyApp) + "<br>");
		}

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
