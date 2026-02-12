package PST;
import java.util.Scanner;
public class Without_pre_char_to_string {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the char:");
	char ch=sc.next().charAt(0);
	
	String str=""+ch;
		System.out.print(str);
          
	}

}
