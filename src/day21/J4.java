package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class J4 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ey", "root", "root");
	
		System.out.println("Connection: " + conn);
		
		String query = "select * from users where userId = ? and username = ?;";
		
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter user id: ");
			int userId = scan.nextInt();
			System.out.print("Enter username: ");
			String username = scan.next();
			
			preparedStatement.setInt(1, userId);
			preparedStatement.setString(2, username);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			ResultSetMetaData rsMeta = rs.getMetaData();
			int columns = rsMeta.getColumnCount();
			
			for(int i = 1; i <= columns; i++) {
				System.out.print(rsMeta.getColumnName(i) + "\t");
			}
			System.out.println();
			
			while(rs.next()) {
				for(int i = 1; i <= columns; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString("password") + "\t");
				System.out.print(rs.getInt("flag") + "\n");
			}
		}
	}
}
