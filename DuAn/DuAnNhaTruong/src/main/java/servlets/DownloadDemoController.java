package servlets;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadDemoController
 */
@WebServlet("/downloadDemoFile")
public class DownloadDemoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DownloadDemoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context = getServletContext();
		String fullPath = context.getRealPath("/views/PT16301-UD.xlsx");

		Path path = Paths.get(fullPath);
		byte[] datas = Files.readAllBytes(path);

		// thiết lập thông tin trả về
		response.setContentType("application/octet-stream");
		response.setHeader("Content-disposition", "attachment; filename=PT16301-UD.xlsx");
		response.setContentLength(datas.length);
		InputStream inputStream = new BufferedInputStream(new ByteArrayInputStream(datas));

		// ghi file ra response outputStream
		OutputStream outputStream = response.getOutputStream();
		byte[] buffer = new byte[4096];
		int byteReads = -1;
		while ((byteReads = inputStream.read(buffer)) != -1) {
			outputStream.write(buffer, 0, byteReads);

		}
		inputStream.close();
		outputStream.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
