/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class Database {
    private static Connection connection;
    public static Connection DBConnection(){
    String dbUrl = "jdbc:mysql://localhost:3306/prak8_13020210004";
    String user = "root";
    String password = "";
    
    try{
    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
    connection = (Connection) DriverManager.getConnection(dbUrl, user, password);
    }catch(SQLException exc){
            System.out.println("Koneksi error : " + exc.getMessage());
    }
    return connection;
    }
    
    public static void closeConnection(){
        try{
            connection.close();
        }catch(SQLException exc){
            System.out.println("gagal masuk ke database" + exc.getMessage());
        }
    }
}