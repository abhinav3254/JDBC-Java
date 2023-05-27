package student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public static boolean insertStudent(Student student) {

        boolean flag = false;
        // method to insert Data to Database
        try {
            Connection connection = CP.createConnection();

            String query = "insert into students(sname,sphone,scity) values (?,?,?)";
            // dynamic query use prepare statement

            java.sql.PreparedStatement statement = connection.prepareStatement(query);
            // set the values of ?
            statement.setString(1, student.getName());
            statement.setString(2, student.getPhone());
            statement.setString(3, student.getCity());

            // execute

            statement.executeUpdate();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean deleteStudent(int id) {
        boolean flag = false;
        // method to insert Data to Database
        try {
            Connection connection = CP.createConnection();

            String query = "delete from students where sid=?";
            // dynamic query use prepare statement

            java.sql.PreparedStatement statement = connection.prepareStatement(query);
            // set the values of ?
            statement.setInt(1, id);

            // execute

            statement.executeUpdate();
            flag = true;
        } catch (Exception e) {
            System.out.println(e + " -----> this is error");
        }
        return flag;
    }

    public static void showAllStudents() {
        // method to insert Data to Database
        try {
            Connection connection = CP.createConnection();

            String query = "select * from students";
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery(query);

            while (set.next()) {
                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString(4);

                System.out.println("ID :- " + id + " ,Name:- " + name + " ,Phone:- " + phone + " ,City :- " + city);
                System.out.println("------------------");
            }

        } catch (Exception e) {
            System.out.println(e + " -----> this is error");
        }
    }
}
