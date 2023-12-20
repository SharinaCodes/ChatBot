import java.util.Scanner;

public class Stage2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String botName = "Jeffrey";
        String yourName;
        int birthYear = 2023;


        System.out.printf("Hello! My name is %s.\n", botName);
        System.out.printf("I was created in %d.\n", birthYear);

        System.out.println("Please, remind me your name.");
        yourName = scanner.nextLine();
        System.out.printf("What a great name you have, %s!", yourName);

    }
}
