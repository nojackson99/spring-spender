package app.java.spring.spender;

import app.java.spring.spender.services.DBConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		DBConnection dbConnection = context.getBean(DBConnection.class);
		dbConnection.ConnectToDB();
	}
}
