package CustomerLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerRegisterDAO 
{
	public static  int k=0;
	public static int insert(CustomerLoginBean bb)
	{
		try
		{
			System.out.println(bb);
			Connection con=DBInfo.getCon();
			PreparedStatement ps=con.prepareStatement("insert into register72 values(?,?,?,?)");
			ps.setString(1, bb.getFullName());
			ps.setString(2, bb.getEmail());
			ps.setString(3, bb.getPassword());
			ps.setLong(4, bb.getPhNumber());
			k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
		
	}
}
