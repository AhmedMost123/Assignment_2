import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int correctPassword = 8888; // assumed correct password
        int trials = 3;

        System.out.print("Enter Password: ");

        while (trials > 0) {
            int enteredPassword = input.nextInt();

            if (enteredPassword == correctPassword) {
                System.out.println("Correct password. Access granted.");
                break;
            } else {
                trials--;

                if (trials > 0) {
                    System.out.println("Incorrect password. Try again. Attempts left: " + trials);
                    System.out.print("Enter Password: ");
                } else {
                    System.out.println("Incorrect password. No more attempts. Access denied.");
                }
            }
        }

        input.close();
    }
}
