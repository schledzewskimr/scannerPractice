import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there! How are you doing today?");

        String firstReply = scanner.next();
        System.out.println(firstReply);
        
        System.out.println("Wow - Interesting. Tell me more about yourself!");

        String secondReply = scanner.next();
        System.out.println(secondReply);
        
        System.out.println("Nice chatting with you! Goodbye!");

    }
}
