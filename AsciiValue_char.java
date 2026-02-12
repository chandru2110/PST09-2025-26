package PST;
import java.util.Scanner;
public class AsciiValue_char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the ascii value:");
		int num=sc.nextInt();
		letter(num);
	}
	static void letter(int num){ 
		char ascii=(char)num;
		System.out.print(ascii);
		}
}