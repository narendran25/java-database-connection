import java.sql.*;
public class connections {
	public  static void main(String[] args) 
	{

	try
	    {

	        Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\lenovo\\eclipse-workspace\\access\\arj.mdb");
	        Statement stment = conn.createStatement();
	        String qry = "SELECT * FROM arj";

	ResultSet rs = stment.executeQuery(qry);
	while(rs.next())
	        {
	            String id    = rs.getString("id") ;
	            String fname = rs.getString("name");

	System.out.println("sno="+id +"\t" +"name=" +fname +"\n");
	        }
	    }
	catch(Exception err)
	    {
	System.out.println(err);
	    }


	//System.out.println("HasithSithila");

	}}  

