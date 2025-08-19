package CustomerLogin;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/adm")
public class LoginServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		System.out.println(name +password);
		boolean status=new CustomerLoginDAO().retrive(name,password);
		System.out.println(status);
		if(status==true)
		{
			req.setAttribute("msg","Login  successfully <br>");
			req.getRequestDispatcher("Message.jsp").forward(req, resp);
		}
		else
		{
			req.setAttribute("msg", "invaild name or password");
			req.getRequestDispatcher("Message.jsp").forward(req, resp);
		}
	}

}
