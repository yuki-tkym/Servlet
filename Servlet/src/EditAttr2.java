

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EditAttr
 */
public class EditAttr2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditAttr2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 日本語表示設定
		response.setContentType("text/html; charset=Windows-31J");

		HttpSession hs = request.getSession();
		hs.setAttribute("status", "new");
		hs.setAttribute("status", "changed");
		hs.removeAttribute("status");


		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("sessionスコープのデータstatusを登録<br>");
		out.println("sessionスコープのデータstatusを変更<br>");
		out.println("sessionスコープのデータstatusを削除");
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

