

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditAttr
 */
public class EditAttr extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditAttr() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 日本語表示設定
		response.setContentType("text/html; charset=Windows-31J");

		ServletContext sc = getServletContext();
		sc.setAttribute("status", "new");
		sc.setAttribute("status", "changed");
		sc.removeAttribute("status");


		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("applicationスコープのデータstatusを登録<br>");
		out.println("applicationスコープのデータstatusを変更<br>");
		out.println("applicationスコープのデータstatusを削除");
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
