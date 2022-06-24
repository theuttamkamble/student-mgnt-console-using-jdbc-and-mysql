package com.stud.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StatementObj {
	// this static method will return the Statement Object
	public static Statement getStmt() throws ClassNotFoundException, SQLException {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mydata";
		String uname="root";
		String pass="root";
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, uname, pass);
		Statement stm = conn.createStatement();
		return stm;
	}
}
