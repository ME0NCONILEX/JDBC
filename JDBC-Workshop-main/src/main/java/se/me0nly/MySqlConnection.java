package se.me0nly;
import se.me0nly.Exception.JDBCConnectionException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
    private static final String USER = "root";
    private static  final String PASS = "P0assword";
    private  static  final String URL = "jdbc:mysql://localhost:3306/world";

    public static Connection getConnection() throws JDBCConnectionException {
        try {

            Connection connection = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("*** JDBC Connection to my world - It works! ***");
            return connection;

        } catch (SQLException e) {
            throw new JDBCConnectionException("Database connection failed");
        }
    }
}