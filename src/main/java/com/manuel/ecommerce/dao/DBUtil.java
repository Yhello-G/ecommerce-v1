package com.manuel.ecommerce.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtil {
	private static final Connection  conn = null;
	
	//static ResourceBundle rb = ResourceBundle.getBundle("com.manuel.ecommerce.util.database");
	
	public  DBUtil() {}
	
/*	public static Connection provideConnection() {
		
		
		try {
			if(conn== null || conn.isClosed()) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(" jdbc:mysql://localhost:3306/shopping", "root", null);

					System.out.println("CONNECTED!");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				


			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return conn;
	}
	*/

	public static Connection provideConnection(){
		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping", "root", "12345");
		} catch ( SQLException sqlException){
			System.out.println("Something ");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}

		return  connection;
	}
	
	
	public static void closeConnection(Connection con) {
		try {
			if(con!=null && !con.isClosed()) {
				
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void closeConnection(ResultSet rs) {
		try {
			if(rs!=null && !rs.isClosed()) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void closeConnection(PreparedStatement ps) {
		try {
			if(ps != null &&  !ps.isClosed()) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
