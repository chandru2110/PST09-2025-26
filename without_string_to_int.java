package PST;
import java.util.Scanner;
public class without_string_to_int {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string:");
		String str=sc.nextLine();
		int temp,num=1;
     for(int i=0;i<=str.length();i++) {
    	  temp=str.length()%10;
    	  num=temp+num%10;
    	  num/=10;
      }
     System.out.println(num);
}
}