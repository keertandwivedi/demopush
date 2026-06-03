import java.util.Scanner; // Import the Scanner class to read input

public class PrintUserInputName {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for their name
        System.out.print("Enter your name: ");
        
        // Read the entire line of text entered by the user
        String userName = scanner.nextLine();
        
        // Print the custom greeting
        System.out.println("Welcome, " + userName + "!");
        
        // Close the scanner resource
        scanner.close();
    }
}