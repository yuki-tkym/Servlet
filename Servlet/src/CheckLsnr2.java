

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Servlet implementation class CheckLsnr2
 */
public class CheckLsnr2 implements HttpSessionAttributeListener, HttpSessionListener  {
	private static int sesCount = 0;

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

	public void attributeAdded(HttpSessionBindingEvent hsbe) {
		ServletContext sc  = hsbe.getSession().getServletContext();
		sc.log(hsbe.getName() + "Added");
	}

	public void attributeReplaced(HttpSessionBindingEvent hsbe) {
		ServletContext sc  = hsbe.getSession().getServletContext();
		sc.log(hsbe.getName() + "Replaced");
	}

	public void attributeRemoved(HttpSessionBindingEvent hsbe) {
		ServletContext sc  = hsbe.getSession().getServletContext();
		sc.log(hsbe.getName() + "Removed");
	}
}
