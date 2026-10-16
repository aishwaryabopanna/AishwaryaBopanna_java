
import java.util.Scanner;

class MyClass {
    int x;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyClass myObj = new MyClass();

        System.out.print("Enter value of X: ");
        myObj.x = sc.nextInt();

        System.out.println("Value of X = " + myObj.x);

        sc.close();
    }
}
