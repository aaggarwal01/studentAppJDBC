package com.takeo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// Step2 Establish Connection

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjd34", "root", "root");
			if (con != null)
				System.out.println("Connection Established");

			else
				System.out.println("Connection is not established");

			// Step3 Create Statement

			st = con.createStatement();
			// ste4: execute the query
			String sql_query = "insert into student values(100,'Shiva', 'Hyb', 'abc.gmail.com')";
			// String sql_query = "delete from student where sno = 102";
			// String sql_query = "update student set sname = 'rani' where sno = 101";
			int count = st.executeUpdate(sql_query);

			if (count != 0)
				System.out.println("Data Insterted Successfully");
			else
				System.out.println("Data Not Instered Successfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
