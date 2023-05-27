package orders;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OrdersDoa {
    public static boolean insertCustomer(Customers customers) {
        boolean flag = false;
        try {
            Connection connection = ConnectionCreate.createConnection();
            String query = "insert into customers (name,password,city) values (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, customers.getName());
            preparedStatement.setString(2, customers.getPassword());
            preparedStatement.setString(3, customers.getCity());

            preparedStatement.executeUpdate();

            flag = true;
        } catch (Exception e) {
            System.out.println(e + " ------->>>>> this is error");
        }

        return flag;
    }
}
