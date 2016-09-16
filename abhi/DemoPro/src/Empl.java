import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Empl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
		try{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhi","root","root");
		
		Statement stmt=con.createStatement();
		Statement stmt1=con.createStatement();
		Statement stmt2=con.createStatement();
		Statement stmt3=con.createStatement();
		
	//stmt.executeUpdate("create table employeeDAO(Id int,Empname varchar(20),address varchar(20),Email varchar(20),Phoneno varchar(15))");//
	stmt.executeUpdate("insert into employeeDAO values (1001,'Sam','201 Passaic Harisson','sam@ibm.com','2828282828')");
		stmt1.executeUpdate("insert into employeeDAO values (1002,'Priya','Manhattan NewYork','priya@gmail.com','29292929229')");
		stmt2.executeUpdate("insert into employeeDAO values (1003,'Rick','MarketAvenue Chicago','rick@yahoo.com','2727272727')");
		stmt3.executeUpdate("insert into employeeDAO values (1004,'Daniel','Market NewJersey','daniel@hotmail.com','8787878787')");
	
		//stmt.executeUpdate("delete from employeeDAO");
		con.close();
	
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

	
	
	}

}
