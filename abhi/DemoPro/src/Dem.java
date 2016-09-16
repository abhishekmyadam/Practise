import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*
;public class Dem {

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
        Statement stmt4=con.createStatement();
stmt.executeUpdate("insert into student1 values(1,'Rahul','NewJersey','rahul@r.com','8282828282')");
stmt.executeUpdate("insert into student1 values(2,'Sam','Harrison','sam@h.com','8242424242')");
stmt.executeUpdate("insert into student1 values(3,'Rick','NewYork','rahul@r.com','8252525282')");
stmt.executeUpdate("insert into student1 values(4,'Daniel','Chicago','daniel@r.com','8262626262')");
stmt.executeUpdate("insert into student1 values(5,'Sameer','India','rahul@r.com','8272727272')");
con.close();
		
		
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	
}
}



