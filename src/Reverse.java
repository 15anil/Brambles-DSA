import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.next();
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Original stirng: " + s);
        System.out.println("Reversed string: " + reversed);
    }
}
