package CustomerLogin;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBInfo 
{
	public static final String driver="oracle.jdbc.driver.OracleDriver";
	public static final String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String dbUser="system";
	public static final String dbPassword="tiger";
	private static Connection con=null;
	public static Connection getCon()
	{
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(dbUrl,dbUser,dbPassword);
			
		}
		catch(Exception e)
		{
			
		}
		return con;
	}
}
