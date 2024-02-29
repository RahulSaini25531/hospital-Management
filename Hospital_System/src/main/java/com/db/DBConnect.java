package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static Connection conn;
	public static Connection getconn()
	{
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Orcl","system","tiger");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		return conn;
	}

}
