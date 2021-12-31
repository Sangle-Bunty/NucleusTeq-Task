import java.sql.*;
import java.util.*;
class Conversion
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//
		System.out.print("Enter the length in Milimeter:-  ");
		double mm = sc.nextDouble();
		
		double centimeter = mm / 10;
		double meter = mm / 1000.0;
		double kilometer = mm / 1000000D;
		
		System.out.println("Length in centimeter:- " + centimeter);
		System.out.println("Length in meter:- " + meter);
		System.out.println("Length in Kilometer:- " + kilometer);
		//
		try
		{

		Class.forName("com.mysql.cj.jdbc.Driver");

		
		//creating a connection
		
		String url="jdbc:mysql://localhost:3306/Measurements";
		String username="root";
		String password="root";


		Connection con=DriverManager.getConnection(url,username,password);

		// create query
		String q="create table length_converter(input_values int,MM double ,CM double, M double, KM double)";

		//create a statement

		Statement stmt=con.createStatement();

		stmt.executeUpdate(q);

		System.out.println("Table created in database...");

		con.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}