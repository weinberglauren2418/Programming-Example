
import java.util.StringTokenizer;
import java.util.Scanner;
public class Weinberg_Lauren_ScanningText {
    public static void main(String[] args) {
       int[] alphabet = new int[26];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String text = input.nextLine().toUpperCase();
        int x = 0;
        StringTokenizer y = new StringTokenizer(text," ");
        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))) {
                x++;
                alphabet[text.charAt(i)-(int)'A']++;
            }
        }
       /* for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)-(int)'A'))
                alphabet[i]++;
        }*/
        System.out.println("This sentence contains " + x + " letters.");
        System.out.println("This sentence contains " + y.countTokens() + " string tokens."); //string tokens = spaces
        System.out.println("The frequency of the letters is: ");

        for (int i = 0; i < alphabet.length; i++){
            if (alphabet[i] > 0) {
                System.out.println((char)(i + 'A') + " -- " + alphabet[i]);
            }
        }
    }
}
