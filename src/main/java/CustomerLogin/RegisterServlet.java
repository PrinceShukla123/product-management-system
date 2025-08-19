package CustomerLogin;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		CustomerLoginBean bb=new CustomerLoginBean();
		bb.setFullName(req.getParameter("name"));
		bb.setEmail(req.getParameter("email"));
		bb.setPassword(req.getParameter("password"));
		bb.setPhNumber(Long.parseLong(req.getParameter("phno")));
		
		int k=CustomerRegisterDAO.insert(bb);
		System.out.println(k);
		if(k>0)
		{
			req.setAttribute("msg","Register successfully <br>");
			req.getRequestDispatcher("Message.jsp").forward(req, resp);
		}
	}
}
