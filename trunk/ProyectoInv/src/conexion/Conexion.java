package conexion;

import java.sql.*;

public class Conexion {

    static String bd = "bd_proinv";
    static String login = "root";
  //  static String password = "admin";
   // static String password = "123123";
    static String password = "123456";
    static String url = "jdbc:mysql://localhost/" + bd;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
        }
    }

    public static Connection getConnection() {
            
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, login, password);
        } catch (SQLException e) {
            //Error en base de datos no se puede lograr la conexion
            System.out.println("Error: Con fuente de datos \n" + e);
        }
        
        return conn;
    }


}
