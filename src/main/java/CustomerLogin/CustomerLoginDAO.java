package CustomerLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class CustomerLoginDAO 
{
	
	public static  boolean retrive(String name,String pass)
	{
		 boolean status=false;
		try
		{
			
			Connection con=DBInfo.getCon();
			PreparedStatement ps=con.prepareStatement("select * from register72 where name=? and password=?");
			ps.setString(1,name);
			ps.setString(2,pass);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			System.out.println("rs"+status);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
	}
}
