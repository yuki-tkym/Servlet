

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


/**
 * Servlet implementation class ExFilter
 */
public class ExFilter2 implements Filter {

	public void init(FilterConfig conf) throws ServletException{}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
		// getServletPath()：HttpServletRequestにキャストをして、サーブレットのパス取得
		System.out.println("ExFilter2 is executing.");
		System.out.println(((HttpServletRequest) request).getServletPath() + ":" + new java.util.Date());
		// 連続したフィルタがある場合それを実行
		// ない場合はもともと要求していたプログラム実行
		chain.doFilter(request, response);
	}

	public void destroy() {}
}

