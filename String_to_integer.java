package PST;
import java.util.Scanner;
public class String_to_integer {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the string:");
     String str=sc.next();
     int num=Integer.parseInt(str);
     System.out.println(num);
	}

}
