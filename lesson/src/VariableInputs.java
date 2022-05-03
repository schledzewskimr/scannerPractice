import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String stringInput = scanner.next();
        
        System.out.println("Enter an integer:");
        Integer integerInput = Integer.valueOf(scanner.next());

        System.out.println("Enter a double:");
        Double doubleInput = Double.valueOf(scanner.next());

        System.out.println("Enter a boolean value:");
        Boolean booleanInput = Boolean.valueOf(scanner.next());

        System.out.println("Your string is " + stringInput);
        System.out.println("Your integer is " + integerInput);
        System.out.println("Your double is " + doubleInput);
        System.out.println("Your boolean is " + booleanInput);
    }
}
