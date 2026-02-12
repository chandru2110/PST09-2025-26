package PST;
import java.util.Scanner;
public class String_ascii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a sentence:");
		String str=sc.next();
		string(str);
	}
static void string(String str) {
	for(int i=0;i<=str.length()-1;i++) {
		int alpha=str.charAt(i);
		
		System.out.println(alpha);
	}
}
}
