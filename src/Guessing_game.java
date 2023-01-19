import java.util.Scanner;

public class Guessing_game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask user bounds for the number
        // make a number to guess
        // ask user to guess the number
        // tell them if they're too big, small, or right
        // when they're right kill the program
        System.out.println("How small can the number go?");
        int min = input.nextInt();
        System.out.println("How big can the number go?");
        int max = input.nextInt();

        int ranNumber = min + (int) (Math.random() * (max - min));
        int guess = -10;
        while (guess != ranNumber) {
            System.out.println("Have a guess");
            guess = input.nextInt();
            if (guess == ranNumber) {
                System.out.println("Good job! You got it!");
            } else if (guess < ranNumber) {
                System.out.println("That's a bit small");
                if (guess > ranNumber - 5) {
                    System.out.println("You're getting close!");
                }
            } else {
                System.out.println("That's a little big");
                if (guess < ranNumber + 5) {
                    System.out.println("You're getting close!");
                }
            }
        }
    }
}
