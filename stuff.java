import java.util.Scanner;

public class stuff {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you? ");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult!");
        }

        else if (age < 0) {
            System.out.println("Please enter a valid integer next time.");
        }

        else if (age <= 18) {
            System.out.println("You are not an adult!");
        }

        System.out.println("I'm very dumb!");

    }
}