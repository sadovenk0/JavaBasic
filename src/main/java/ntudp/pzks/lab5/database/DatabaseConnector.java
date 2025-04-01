package ntudp.pzks.lab5.database;

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;

 public class DatabaseConnector {
     private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
     private static final String USER = "sadovenk0";
     private static final String PASSWORD = "sadovenk0";

     public static Connection getConnection() throws SQLException {
         return DriverManager.getConnection(URL, USER, PASSWORD);
     }
 }