
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter details of Student 1:");
        System.out.print("Enter Roll Number: ");
        s1.rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        s1.name = sc.nextLine();

        System.out.println("\nEnter details of Student 2:");
        System.out.print("Enter Roll Number: ");
        s2.rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        s2.name = sc.nextLine();

        System.out.println("\n--- Student 1 ---");
        System.out.println("Roll Number: " + s1.rollNo);
        System.out.println("Name: " + s1.name);

        System.out.println("\n--- Student 2 ---");
        System.out.println("Roll Number: " + s2.rollNo);
        System.out.println("Name: " + s2.name);

        sc.close();
    }
}
