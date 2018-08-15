Program:

importjava.sql.DriverManager;
importjava.sql.Connection;
importjava.sql.SQLException;
	importjava.sql.*;  
publicclassmysqlconnect {
	publicstaticvoidmain(String args[]){  
	try{
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/nametable","root", "");
	//here sonoo is database name, root is username and password  
	Statement stmt=con.createStatement();  
	ResultSetrs=stmt.executeQuery("select * from arj");  
	while(rs.next())  
	System.out.println("Name=" +rs.getString(1)+"\t " +"Id=" +rs.getString(2)+"  ");  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
	
}

