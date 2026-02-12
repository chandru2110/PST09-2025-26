package PST;
import java.util.Scanner;
public class Without_pre_string_to_char {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("enter the string:");
			String str=sc.next();
			for(int i=0;i<=str.length()-1;i++) {
				char ch=str.charAt(i);
				System.out.print(ch);
			}
		

	}

}
