import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Cst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("please enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		//System.out.println("enter contact");//
		//String contact=sc.next();//
		System.out.println("enter address");
		String address=sc.next();
		System.out.println("enter city");
		String city=sc.next();
		
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		
		
		try{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhi","root","root");
	//PreparedStatement p=con.prepareStatement("create table cusbio(id int,name varchar(20),contact varchar(10),address varchar(20),city varchar(10))");//	
	/*PreparedStatement pd=con.prepareStatement("insert into cusbio (id,name,contact,address,city) values(?,?,?,?,?)");
	pd.setInt(1,1);
	pd.setString(2, "Alfreds F");
	pd.setString(3, "Maria ");
	pd.setString(4, "Obere Str. 57");
    pd.setString(5,"Berlin");
	pd.executeUpdate();	
	pd.close();*/
	/*
	
	PreparedStatement pd1=con.prepareStatement("insert into cusbio (id,name,contact,address,city) values(?,?,?,?,?)");
	pd1.setInt(1,2);
	pd1.setString(2, "Ana Trujillo ");
	pd1.setString(3, "Trujillo");
	pd1.setString(4, "Avda. de la 2222");
    pd1.setString(5,"Mexico");
	pd1.executeUpdate();	
	pd1.close();
	
	
	PreparedStatement pd2=con.prepareStatement("insert into cusbio (id,name,contact,address,city) values(?,?,?,?,?)");
	pd2.setInt(1,3);
	pd2.setString(2, "Moreno Taquería ");
	pd2.setString(3, "Moreno");
	pd2.setString(4, "Mataderos 2312");
    pd2.setString(5,"Mexico");
	pd2.executeUpdate();	
	pd2.close();
	
	
	PreparedStatement pd3=con.prepareStatement("insert into cusbio (id,name,contact,address,city) values(?,?,?,?,?)");
	pd3.setInt(1,4);
	pd3.setString(2, "Around the Horn ");
	pd3.setString(3, "Thomas");
	pd3.setString(4, "120 Hanover Sq.");
    pd3.setString(5,"London");
	pd3.executeUpdate();	
	pd3.close();
	*/
	
			
			
		/*	PreparedStatement pd4=con.prepareStatement("update cusbio set name=? where id=?");
	pd4.setString(1,"Around the house ");
pd4.setInt(2,4);			
	pd4.executeUpdate();*/
	
			PreparedStatement pd5=con.prepareStatement("update cusbio set name=?,address=?,city=? where id=?");
			pd5.setString(1,name);
			pd5.setString(2,address);
			pd5.setString(3,city);
			pd5.setInt(4,id);
			pd5.executeUpdate();
			con.close();
	
		
		
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	}catch(ClassNotFoundException e){
	e.printStackTrace();
}
	}
}
