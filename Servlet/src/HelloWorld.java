

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
//HttpServletクラスを継承しています。
public class HelloWorld extends HttpServlet {
//doGetメソッドをオーバーライドしています。
public void doGet(HttpServletRequest req,
                    HttpServletResponse res)
                    throws ServletException, IOException {

	// 文字化け対策（開始）
	res.setContentType("text/html; charset=Windows-31J");
    req.setCharacterEncoding("Windows-31J");
	// 文字化け対策（終了）

    String[] name = {"Tanaka","Kaneko","Kimura","Yokoyama","Imura"};


	PrintWriter out = res.getWriter();
	out.println("<HTML>");
	out.println("<BODY>");
	out.println("<TABLE BORDER =\"1\">");
	out.println("<TR>");
	out.println("<TH>id</TH>");
	out.println("<TH>名前</TH>");
	out.println("</TR>");

	for(int i = 0; i < name.length; i++) {
		out.println("<TR>");
		out.println("<TD>" + i + "</TD>");
		out.println("<TD>" + name[i] + "</TD>");
		out.println("</TR>");
	}
	out.println("</TABLE>");
	out.println("</BODY>");
	out.println("</HTML>");

}
}
