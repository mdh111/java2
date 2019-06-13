package DatabaseInsert.Mike6;
import java.awt.event.*;
import java.sql.*;

public class EHandler implements ActionListener {
	
	static Statement stmt;
	static Connection conn;
	
	public EHandler() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nationwide","root","password");;
			stmt=conn.createStatement();
		} catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}

	public void actionPerformed(ActionEvent e) {
		String reg,nme,mark;
		reg=Main.textRegno.getText();
		nme=Main.textName.getText();
		mark=Main.textMarks.getText();
		try {
			stmt.executeUpdate("insert into school values("+reg+",'"+nme+"',"+mark+")");
		} catch(Exception ex) {
			System.out.println(ex.toString());
		}
		Main.textRegno.setText("");
		Main.textName.setText("");
		Main.textMarks.setText("");
	}

	
	
}
