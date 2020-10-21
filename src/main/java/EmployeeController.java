import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeController extends HttpServlet{
	
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		String id=req.getParameter("id");
		String name=req.getParameter("employeeName");
		String sal=req.getParameter("sal");
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
		
		PrintWriter out=res.getWriter();
		out.println(id);
		out.println(name);
		out.println(sal);
	}

}
