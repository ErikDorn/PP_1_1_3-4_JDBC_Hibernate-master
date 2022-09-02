package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/users?serverTimezone=Europe/Moscow&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Sdi+hu+2121=%";
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
                System.out.println("Connection OK");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                System.out.println("Connection ERROR");
            }
        }
        return connection;
    }
}
