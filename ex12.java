import java.util.Scanner;

class NumberGamingAnalytics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, guess;
        int attempts = 0;

        System.out.println("=== NUMBER GAMING ANALYTICS ===");
        System.out.print("Enter a secret number (1-100): ");
        number = sc.nextInt();

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("Correct Guess!");
            } else if (guess < number) {
                System.out.println("Try a Higher Number.");
            } else {
                System.out.println("Try a Lower Number.");
            }

        } while (guess != number);

        System.out.println("\n--- GAME ANALYTICS ---");
        System.out.println("Secret Number: " + number);
        System.out.println("Total Attempts: " + attempts);

        if (attempts == 1)
            System.out.println("Performance: Excellent!");
        else if (attempts <= 3)
            System.out.println("Performance: Very Good!");
        else if (attempts <= 5)
            System.out.println("Performance: Good!");
        else
            System.out.println("Performance: Keep Practicing!");

        sc.close();
    }
}