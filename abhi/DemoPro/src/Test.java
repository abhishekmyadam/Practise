import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
		try{
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhi","root","root");
			
			
Statement stmt=con.createStatement();
//Statement stmt1=con.createStatement();
//Statement stmt2=con.createStatement();
//Statement stmt3=con.createStatement();
//Statement stmt4=con.createStatement();
stmt.executeUpdate("create table exepenses(id int,name varchar(20),item varchar(20),location varchar(20),phone varchar(10))");
//stmt1.executeUpdate("insert into expenses values (1,'Alfreds','Maria Ande','Obere','44444')");
//stmt2.executeUpdate("insert into expenses values (2,'Ana Trujidos','Ana Trujillo','Avda222','3333')");
//stmt3.executeUpdate("insert into expenses values (3,'Antoni','Antonio Moreno','Mataderos 2312','2222')");
//stmt4.executeUpdate("insert into expenses values (4,'Around the Horn','Thomas Hardy','120 Hanover Sq.','11111')");


			
			
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		}catch(ClassNotFoundException e){
		e.printStackTrace();			
}
		
		
		
	}

}
