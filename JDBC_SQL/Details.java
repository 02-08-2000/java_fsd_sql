/**
 * 
 */
package BATCH3.JDBC_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Administrator
 *
 */
public class Details
{
	public static void main(String args[])
	{  
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/meghana","root","pass@word1");  
//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("create table meghana(name varchar(10),id int(6),email_id varchar(15)"+"insert into meghana values('meghana','34562','megha@.com')");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			con.close();  
		}
		catch(Exception e)
		{
			System.out.println(e);
}
	}
}
