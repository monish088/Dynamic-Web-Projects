import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet implementation class ServletImpl
 */
@WebServlet("/ServletImpl")
public class ServletImpl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletImpl() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

    public void service(ServletRequest req, ServletResponse res)
    	throws ServletException, IOException{
    		System.out.println("Inside Service room");
    		res.setContentType("text/html");
    		
    		PrintWriter out = res.getWriter();
    		out.print("<html><body>");
    		out.print("<b> Servet Interface Example</b>");
    		out.print("</body></html>");
    }
    
    public String getServletInfo() {
    	return "Demonstrated implementation of Servlet interface";
    }
    
    public void destroy() {
    	System.out.println("Inside destroy method");
    }
}