package orders;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCreate {
    static Connection connection;

    public static Connection createConnection() {
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "abhi3254";
            String url = "jdbc:mysql://127.0. 0.1:3306/school";

            connection = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.out.println(e + " -------> This is error");
        }

        return connection;
    }
}
