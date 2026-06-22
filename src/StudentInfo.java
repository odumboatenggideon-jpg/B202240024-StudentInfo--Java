package StudentInfo;
import java.util.Scanner;
public class StudentInfo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variables
        String name;
        String IndexNumber;

        String gender, department;
        String adultStatus, academicClass;
        int age, level;
        double GPA;

        //Inputting Student
        System.out.print("Enter Student Full Name: ");
        name = input.nextLine();

        System.out.print("Enter Student Index Number: ");
        IndexNumber = input.nextLine();

        System.out.print("Enter Student Age: ");
        age = input.nextInt();
input.nextLine();

        System.out.print("Enter Student Gender: ");
        gender = input.nextLine();

        System.out.print("Enter Student Department: ");
        department = input.nextLine();

        System.out.print("Enter Student Level: ");
        level = input.nextInt();

        System.out.print("Enter Student GPA: ");
        GPA = input.nextDouble();

        //Checking for Students Adult Status
        if (age >= 18) {
            adultStatus = "Yes";
        } else {
            adultStatus = "No";
        }


        //GPA Classifications
        if (GPA >= 3.5 && GPA <= 4.0) {
            academicClass = "First Class";
        } else if (GPA >= 3.0) {
            academicClass = "Second Class Upper";
        } else if (GPA >= 2.5) {
            academicClass = "Second Class Lower";
        } else {
            academicClass = "Pass";
        }


        //Displaying Student Details Collected
        System.out.println("\n====== STUDENT DETAILS =======");
        System.out.println("Student Full Name: " + name);
        System.out.println("Student Index Number: " + IndexNumber);
        System.out.println("Student Age: " + age + "years");
        System.out.println("Student Gender: " + gender);
        System.out.println("Student Department: " + department);
        System.out.println("Student Level: " + level);
        System.out.println("Student GPA: " + GPA);
        System.out.println("Student Adult Status: " + adultStatus);
        System.out.println("Student Academic Class: " + academicClass);

input.close();
    }
}