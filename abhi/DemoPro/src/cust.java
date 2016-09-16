import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class cust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
		try{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhi","root","root");
		
		Statement stmt1=con.createStatement();
		Statement stmt2=con.createStatement();
		Statement stmt3=con.createStatement();
		Statement stmt4=con.createStatement();
		
//	stmt.executeUpdate("create table customer(Id int,Empname varchar(20),address varchar(20),Email varchar(20),Phoneno varchar(15))");//
	stmt1.executeUpdate("insert into customer values (101,'amar','201 Passaic Harisson','sam@ibm.com','2828282828')");
		stmt2.executeUpdate("insert into customer values (102,'Pakshi','Manhattan NewYork','priya@gmail.com','29292929229')");
		stmt3.executeUpdate("insert into customer values (103,'kick','MarketAvenue Chicago','rick@yahoo.com','2727272727')");
		stmt4.executeUpdate("insert into customer values (104,'king','Market NewJersey','daniel@hotmail.com','8787878787')");
	
		//stmt.executeUpdate("delete from customer");
		con.close();
	
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

	
	
	}

}
