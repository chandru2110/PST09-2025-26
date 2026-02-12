package PST;
import java.util.Scanner;
public class ASCII_VALUE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the letter:");
		char ch=sc.next().charAt(0);
		let.ascii(ch);
	}
}
class let{
	 static void ascii(char ch) {
		 int asciivalue = ch;
	      System.out.println(ch);
	      System.out.println(asciivalue);
	 }
}