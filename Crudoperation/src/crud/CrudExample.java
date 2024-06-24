package crud;
import java.sql.*;
import javax.sql.*;

import Connection.Makeconnection;

public class CrudExample {
	static Statement st;
	static Connection cn;
	public CrudExample()
	{
		cn = Makeconnection.getConnection();
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void insertData(Integer Eno,String name,String stream)
	{
		String squery = "insert into Student values('"+Eno+"','"+name+"','"+stream+"')";
		try {
			int r = st.executeUpdate(squery);
			if (r>0)
			{
				System.out.println("Inserted succesfully");
			}
		}
		catch(SQLIntegrityConstraintViolationException sq)
		{
		    System.out.println("Duplicate value encountered");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void DeleteData(Integer Eno)
	{
		String sq = "delete from Student where eno = '"+Eno+"'";
		try {
			int k = st.executeUpdate(sq);
			if(k>0)
			{
				System.out.println("Record deleted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void UpdateData()
	{
		
	}
	public static void getData()
	{
		String sq = "select * from Student";
		try {
			ResultSet r =st.executeQuery(sq);
			while(r.next())
			{
				System.out.println(r.getString(1)+"  "+r.getString(2)+"  "+r.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


