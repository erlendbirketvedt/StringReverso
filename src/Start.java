import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to be reversed: ");
        String s = scanner.nextLine();
        String reverso = new StringBuilder(s).reverse().toString();
        System.out.println("You entered " + s + ". " + "Let's reverse it: " + reverso);
        
    }
}
