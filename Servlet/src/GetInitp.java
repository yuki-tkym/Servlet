

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetInitp
 */
public class GetInitp extends HttpServlet {



	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetInitp() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() {
    	// Servlet単位の初期化パラメータ
    	ServletConfig sc = getServletConfig();
    	String param_name = sc.getInitParameter("param-name");
    	String param_value = sc.getInitParameter("param-value");
    	// Context単位の初期化パラメータ
    	ServletContext scon = getServletConfig().getServletContext();
    	String description = scon.getInitParameter("description");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=Windows-31J");
		ServletConfig config = this.getServletConfig();
		Enumeration eParmNames = config.getInitParameterNames();
		ServletContext context = this.getServletContext();
		Enumeration parmEnum = context.getInitParameterNames();


		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>サーブレットの初期化パラメータ（名前：値）</h3>");
		while (eParmNames.hasMoreElements()) {
			String parm = (String) eParmNames.nextElement();
			out.println(parm + ":" + config.getInitParameter(parm) + "<br>");
		  }
		out.println("<h3>コンテキストの初期化パラメータ（名前：値）</h3>");
		while (parmEnum.hasMoreElements()) {
			String name = (String)parmEnum.nextElement();
			out.println(name + ":" + context.getInitParameter(name) + "<br>");
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
