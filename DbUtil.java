package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	
	public static Connection getConnection() {
		
		Connection conn=null;
		try {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ahmed";
		String username = "root";
		String password = "root";
        
		Class.forName(driver);
		conn = DriverManager.getConnection(url, username,password);
		System.out.println("Connection Established");
		} catch (Exception e) {
		System.out.println(e);
		
		}
		return conn;  

}
	public static void main(String[] args) {
		System.out.println(DbUtil.getConnection());
	}
}
