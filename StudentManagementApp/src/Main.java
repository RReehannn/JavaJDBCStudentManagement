import Student.student;
import Student.studentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true){
            System.out.println("PRESS 1 to ADD student");
            System.out.println("PRESS 2 to DELETE student");
            System.out.println("PRESS 3 to DISPLAY student");
            System.out.println("PRESS 4 to EXIT app");

            int c =Integer.parseInt(br.readLine());

            if (c==1){
                // add student..
                System.out.println("Enter user name : ");
                String name= br.readLine();

                System.out.println("Enter user Phone : ");
                String phone = br.readLine();

                System.out.println("Enter user City : ");
                String city = br.readLine();

                //Create student object to store student
                student st = new student(name, phone, city);
                boolean answer= studentDao.insertStudentToDB(st);
                if (answer){
                    System.out.println("student is added successfully....");
                }else {
                    System.out.println("Something went wrong try again....");
                }
                System.out.println(st);
            } else if (c==2) {
                // Delete student...
                System.out.println("Enter student id to delete: ");
                int userId = Integer.parseInt(br.readLine());
                boolean f= studentDao.deleteStudent(userId);
                if (f){
                    System.out.println("Deleted");
                } else {
                    System.out.println("Something Went wrong");
                }


            } else if (c==3) {
                // Display Student..
                studentDao.showAllStudent();


            } else if (c==4) {
                // exit
                break;

            } else {

            }
        }
        System.out.println("Thankyou for using my application...");
        System.out.println("See you soon");
    }
}