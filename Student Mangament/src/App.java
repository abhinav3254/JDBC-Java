import java.io.BufferedReader;
import java.io.InputStreamReader;

import student.Student;
import student.StudentDao;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Student Mangement Application");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to exit student");

            int choice = Integer.parseInt(br.readLine());

            if (choice == 1) {
                // add data
                System.out.println("Enter These Filelds");
                System.out.println("Enter Name");
                String name = br.readLine();
                System.out.println("Enter Phone");
                String phone = br.readLine();
                System.out.println("Enter City");
                String city = br.readLine();

                Student student = new Student(name, phone, city);

                Boolean ans = StudentDao.insertStudent(student);

                if (ans) {
                    System.out.println("inserted");
                } else {
                    System.out.println("something went wrong");
                }

            } else if (choice == 2) {
                System.out.println("Delete section");
                System.out.println("Enter Student ID to delete");
                int id = Integer.parseInt(br.readLine());
                Boolean ans = StudentDao.deleteStudent(id);
                if (ans) {
                    System.out.println("delete");
                } else {
                    System.out.println("something went wrong");
                }
            } else if (choice == 3) {
                StudentDao.showAllStudents();
            } else if (choice == 4) {
                break;
            } else {

            }

        }

        System.out.println("Exit Succesfully");
    }
}
