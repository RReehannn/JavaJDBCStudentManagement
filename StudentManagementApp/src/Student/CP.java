package Student;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
    static Connection con;

    public static Connection createC(){

        try {
            //Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create the connection....
            String user = "root";
            String password = "Rehan786@";
            String url = "jdbc:mysql://localhost:3306/student_manage";
            con= DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    
}
