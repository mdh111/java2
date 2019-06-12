package NationwideSchool.Mike5;
import java.sql.*;
public class Dbmysql {
	public static void main(String[] args) {
		boolean insert = false;
		boolean select = true;
		
		Connection conn=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nationwide?useLegacyDatetimeCode=false&serverTimezone=Europe/London","root","password");
			stmt = conn.createStatement();
			
			if(insert) {
				stmt.executeUpdate("insert into school values(32,'sam',29)");
			}

			if(select) {
				ResultSet rs = stmt.executeQuery("select * from school");
				while (rs.next()) {
					System.out.println(rs.getString("name")+" scored "+rs.getInt("marks")+"\n-------------------");
				}
				rs.close();
			}
			
			stmt.close();
			conn.close();
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
