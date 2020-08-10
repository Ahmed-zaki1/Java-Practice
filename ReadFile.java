package com.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ReadFile
{ 
	public static void main(String[] args) throws IOException, SQLException {

		PreparedStatement ps = null;


		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/readfile","root","root");
		    String read=null;
		    BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\zaki\\Desktop\\Ahmed.txt")); 
		    while ((read = in.readLine()) != null) {
		        String[] splited = read.split("\\|");
		        String name=splited[0];
		       String  age=splited[1];
		       String height=splited[2];
		        String weight=splited[3];      
		        addpatient(name, age, height, weight);
		        
		        
		        String sql=" insert into file (a,b,c,d) values (?,?,?,?)";
			    ps=con.prepareStatement(sql);
			    ps.setString(1, name);
			    ps.setString(2, age);
			    ps.setString(3, height);
			    ps.setString(4, weight);
			    int cnt=ps.executeUpdate();
			    System.out.println(cnt);
			    		    
		        
		        
		    }
		    
		    
		    

		}
		catch (Exception e) {System.out.println("There was a problem: " + e);
		}
		


		}

	private static void addpatient(String name, String age, String height, String weight) {
		// TODO Auto-generated method stub
		
	}
} 