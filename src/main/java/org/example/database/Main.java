package org.example.database;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Se ha conectado");
            Statement statement = connection.createStatement();
           // statement.executeUpdate("INSERT INTO users (email,username) VALUES ('user2@test.com', 'user2')");
           ResultSet res = statement.executeQuery("SELECT * FROM users");
            System.out.println();
            while (res.next()) {
                System.out.println(res.getString("email"));
                System.out.println(res.getString("username"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
