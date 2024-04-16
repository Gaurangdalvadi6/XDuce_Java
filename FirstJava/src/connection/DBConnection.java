package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DBConnection {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/gaurang";
			String username = "admin";
			String password = "Admin@123";
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		String q = "insert into student values(?,?,?)";
		PreparedStatement pst = connection.prepareStatement(q);
		
		pst.setInt(1, 50);
		pst.setString(2, "Python");
		pst.setInt(3, 85);
		
		pst.execute();
		System.out.println("data inserted successfully");
		
		// delete query
//		String q = "delete from student where sid=10";
//		PreparedStatement pst = connection.prepareStatement(q);
//		pst.executeUpdate();
//		System.out.println("data deleted successfully...");

		// update data
//		String q = "update student set name='Java' where sid=1";
//		PreparedStatement pst = connection.prepareStatement(q);
//		pst.executeUpdate();
//		System.out.println("Data update successfully");
		
		// for data insert
//		String q = "insert into student values(15,'goutami',99)";
//		PreparedStatement pst = connection.prepareStatement(q);
//		pst.execute();
//		System.out.println("data inserted successfully");
		
		// select query
//			Statement st =connection.createStatement();
//			ResultSet rs = st.executeQuery(q);
//			while (rs.next()) {
//				int id = rs.getInt("sid") ;
//				String name = rs.getString("name");
//				int marks = rs.getInt("marks") ;
//				
//				System.out.println("id : " + id +" name : "+name + " marks : "+marks);
//			}
		
	}

}
