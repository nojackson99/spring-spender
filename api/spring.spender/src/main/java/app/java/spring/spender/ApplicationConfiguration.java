package app.java.spring.spender;

import app.java.spring.spender.services.DBConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public DBConnection dbConnection() {
        return new DBConnection();
    }
}


