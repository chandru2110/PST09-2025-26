package project1.pst;
import java.util.Scanner;
public class vowalconsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch =sc.next().charAt(0);
		char lowerCh = Character.toLowerCase(ch);

        if (lowerCh == 'a'||lowerCh == 'e' || lowerCh == 'i'|| lowerCh == 'o'|| lowerCh == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) { // Check if it's a letter
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
         sc.close();
     }

}
