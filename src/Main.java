import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String botName = "Jeffrey";
        int birthYear = 2023;

        introduceBot(botName, birthYear);
        getUserInfo(scanner);
        guessAge(scanner);
        countUp(scanner);
        quizUser(scanner);

    }

    private static void quizUser(Scanner scanner) {
        int answer = 0;
        StringBuilder question = new StringBuilder();
        question.append("Why do we use methods?\n");
        question.append("1. To repeat a statement multiple times.\n");
        question.append("2. To decompose a program into several small subroutines.\n");
        question.append("3. To determine the execution time of a program.\n");
        question.append("4. To interrupt the execution of a program.\n");

      System.out.println("Let's test your programming knowledge.");
        System.out.println(question.toString());

        do {
            answer = scanner.nextInt();
            if( answer != 2) {
                System.out.println("Please, try again.");
            }
        } while(answer != 2);

        System.out.println("Congratulations, have a nice day!");

    }

    private static void countUp(Scanner scanner) {
        int numberToCountTo;
        System.out.println("Now I will prove to you that I can count to any number you want.");
        numberToCountTo = scanner.nextInt();

        for (int i = 0; i <= numberToCountTo; i++) {
            System.out.printf("%d!%n", i);
        }
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

        System.out.printf("Your age is %d; that's a good time to start programming!\n", age);
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