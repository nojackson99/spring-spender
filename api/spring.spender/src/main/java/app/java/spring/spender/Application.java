package app.java.spring.spender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		String DB_URL = Config.getDbUrl();
		String USER = Config.getDbUsername();
		String PASS = Config.getDbPassword();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// Register JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// Execute create table query
//			System.out.println("Create create table statement...");
//			String sql = "CREATE TABLE employees (" +
//					"    id INT AUTO_INCREMENT PRIMARY KEY," +
//					"    first_name VARCHAR(50) NOT NULL," +
//					"    last_name VARCHAR(50) NOT NULL," +
//					"    email VARCHAR(100) NOT NULL UNIQUE," +
//					"    hire_date DATE NOT NULL" +
//					")";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.executeUpdate();

			// Execute a query
//			System.out.println("Creating statement...");
//			String sql = "INSERT INTO employees (first_name, last_name, email, hire_date) VALUES (?, ?, ?, ?)";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "noah");
//			pstmt.setString(2, "jackson");
//			pstmt.setString(3, "email@gmail.com");
//			pstmt.setString(4, "2020-01-01");
//			pstmt.executeUpdate();

			// Query the database
			String sql = "SELECT first_name, last_name FROM employees";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			// Extract data from result set
			while (rs.next()) {
				//int id = rs.getInt("id");
				String column1 = rs.getString("first_name");
				String column2 = rs.getString("last_name");

				// Display values
				//System.out.print("ID: " + id);
				System.out.print(", Column1: " + column1);
				System.out.println(", Column2: " + column2);
			}
		} catch (SQLException | ClassNotFoundException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} finally {
			// Close resources
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}
