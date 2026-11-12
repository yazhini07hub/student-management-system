
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Java Marks: ");
        int java = sc.nextInt();

        System.out.print("Enter Python Marks: ");
        int python = sc.nextInt();

        System.out.print("Enter SQL Marks: ");
        int sql = sc.nextInt();

        int total = java + python + sql;
        double average = total / 3.0;

        System.out.println("\nSTUDENT REPORT");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (java >= 35 && python >= 35 && sql >= 35) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}
