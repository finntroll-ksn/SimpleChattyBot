import java.util.*;

public class SimpleChattyBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = "Bot";
        int year = 2019;

        greet(name, year);
        remindName();
        guessAge();
        count();
        test();
        end();
    }
    static void greet(String name, int year) {
        System.out.println("Hello! My name is " + name);
        System.out.println("I was created in " + year);
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        System.out.println("What a great name you have, " + scanner.nextLine() + "!");
    }

    static void guessAge() {
        int age;

        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        age = (scanner.nextInt() * 70 + scanner.nextInt() * 21 + scanner.nextInt() * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int limit = scanner.nextInt();

        for(int i = 0; i <= limit; i++) {
            System.out.println(i + "!");
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        while (scanner.nextInt() != 2) {
            System.out.println("Please, try again.");
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
