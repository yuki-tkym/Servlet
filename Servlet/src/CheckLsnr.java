

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Servlet implementation class CheckLsnr
 */
public class CheckLsnr implements ServletContextAttributeListener {
	public void attributeAdded(ServletContextAttributeEvent scae) {
		ServletContext sc = scae.getServletContext();
		sc.log(scae.getName() + "Added");
	}

	public void attributeReplaced(ServletContextAttributeEvent scae) {
		ServletContext sc = scae.getServletContext();
		sc.log(scae.getName() + "Replaced");
	}

	public void attributeRemoved(ServletContextAttributeEvent scae) {
		ServletContext sc = scae.getServletContext();
		sc.log(scae.getName() + "Removed");
	}

}
