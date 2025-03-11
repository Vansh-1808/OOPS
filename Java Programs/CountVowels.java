import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int vowelCount = 0;

        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) { // Check if the character is a vowel
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
