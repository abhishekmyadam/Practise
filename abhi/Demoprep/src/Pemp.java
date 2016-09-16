import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Pemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*
		Scanner sc=new Scanner(System.in);
	
	System.out.println("please enter id");
	int id=sc.nextInt();
	System.out.println("please enter amount");
	String s=sc.next();*/
	
	try{
			Class.forName("com.mysql.jdbc.Driver");
		try{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhi","root","root");
		    //Statement stmt=con.createStatement();
			//PreparedStatement pstmt=con.prepareStatement();
			//pstmt.setInt();//
		//	pstmt.executeUpdate("create table faculty(id int,amount varchar(10)");
		    
		    
		   //PreparedStatement p=con.prepareStatement("delete from employeeDAO   where id=?");//
//p.setInt(1,1004);//
PreparedStatement p1=con.prepareStatement("delete from employeeDAO   where id=?");
p1.setInt(1,1003);

//p.setString(2,"sam");//
		   p1.executeUpdate();
		   System.out.println("data deleted");
	 /*ResultSet rs=p.executeQuery();
		   while(rs.next()){
		int id1=rs.getInt(1);
	//	String username=rs.getString(2);
		System.out.println(id1);
//System.out.println(username);
	}
		//outputResultSet(rs);//
		rs.close();*/
		//pstmt.close();
		p1.close();
		con.close();
		
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}
	
	
	
	}
}
	
