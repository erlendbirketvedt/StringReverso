import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to be reversed: ");
        String s = scanner.nextLine();
        StringReverser sr = new StringReverser();
        sr.SimpleReverse(s);
        sr.AdvanceReverse(s);

    }
}
