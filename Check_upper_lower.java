package PST;
import java.util.Scanner;
public class Check_upper_lower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the letter:");
		char ch=sc.next().charAt(0);
		check(ch);
	}
static void check(char ch) {
	if(ch>=65 && ch<=90) {
		System.out.println("it is the upper case:"+ch);
	}
	else if(ch>=97 && ch<=122) {
		System.out.println("it is the lower case:"+ch);
	}
	else {
		System.out.println("it is the other special case letter");
	}
}
}
