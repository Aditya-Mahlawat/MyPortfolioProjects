import java.util.Scanner;  // Import Scanner class for input

public class HelloWorld {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        // Print output
        System.out.println("Hello, welcome to Java!");

        // Taking input from user
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();  // Reading string input

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();  // Reading integer input

            // Conditional check
            if (age >= 18) {
                System.out.println("Hi " + name + ", you are an adult.");
            } else {
                System.out.println("Hi " + name + ", you are a minor.");
            }

        } // Scanner is automatically closed here
    }
}
