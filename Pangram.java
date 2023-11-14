import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();

        boolean result = isPangram(input);
        System.out.println("Is it a pangram? " + result);
    }

    private static boolean isPangram(String s) {
        Set<Character> letters = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.add(ch);
            }
        }

        return letters.size() == 26;
    }
}