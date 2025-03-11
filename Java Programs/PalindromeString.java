import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(rev))
            System.out.println("The string is a Palindrome.");
        else
            System.out.println("The string is NOT a Palindrome.");
    }
}