package student;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

    // static Connection connection;
    static Connection connection;

    public static Connection createConnection() {
        // step 1: Load the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // step 2:- create the connection

            String userName = "root";
            String password = "abhi3254";
            // school is database name
            String url = "jdbc:mysql://127.0. 0.1:3306/school";

            connection = DriverManager.getConnection(url, userName, password);

        } catch (Exception e) {
            System.out.println(e + "----> This is error");
        }

        return connection;
    }
}
