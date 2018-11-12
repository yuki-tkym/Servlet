

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
/**
 * Servlet implementation class UpFile
 */
public class UpFile extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpFile() {
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
		String path = new String("C:\\Users\\p000h16181\\Documents\\attached");

		DiskFileItemFactory factory = new DiskFileItemFactory();
		// ServletFileUpload(FileItemFactory fileItemFactory)：FileItemのインスタンス作成
		ServletFileUpload upload = new ServletFileUpload(factory);

		System.out.println("メモリバッファの最大値超えたときに利用されるディレクトリ");
		System.out.println(getServletContext().getAttribute("javax.servlet.context.tempdir"));


		factory.setSizeThreshold(1024);
		upload.setSizeMax(-1);

		try {
			List<FileItem> items = upload.parseRequest(request);


			for(FileItem item :items) {
				if (!item.isFormField()) {
					String fileName = item.getName();
					if((fileName != null) && (!fileName.equals(""))){
						fileName=(new File(fileName)).getName();
						item.write(new File(path + "/" + fileName));
					}
				}
			}


		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		response.sendRedirect("sample14.html");

	}

}
