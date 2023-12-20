import java.util.Scanner;

public class Stage3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String botName = "Jeffrey";
        int birthYear = 2023;

        introduceBot(botName, birthYear);
        getUserInfo(scanner);
        guessAge(scanner);

    }

    private static void guessAge(Scanner scanner) {
        int[] remainders = new int[3];
        int age;
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        remainders[0] = scanner.nextInt();
        remainders[1] = scanner.nextInt();
        remainders[2] = scanner.nextInt();

        age = (remainders[0] * 70 + remainders[1] * 21 + remainders[2] * 15) % 105;

        System.out.printf("Your age is %d; that's a good time to start programming!", age);
    }

    private static void getUserInfo(Scanner scanner) {
        String yourName;
        System.out.println("Please, remind me your name.");
        yourName = scanner.nextLine();
        System.out.printf("What a great name you have, %s!%n", yourName);
    }

    private static void introduceBot(String botName, int birthYear) {

        System.out.printf("Hello! My name is %s.\n", botName);
        System.out.printf("I was created in %d.\n", birthYear);
    }
}
