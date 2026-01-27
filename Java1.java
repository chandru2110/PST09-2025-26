package project1.pst ;
import java.util.Scanner;
public class Java1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value1:56");
		int a=sc.nextInt();
		System.out.println("enter the value2:");
		int b=sc.nextInt();
		 
		int Sum=a+b;
		int difference=a-b;
		int product=a*b;
		int quotine=a/b;
		 
		System.out.println("sum:"+ Sum);
		System.out.println("difference:"+ difference);
		System.out.println("product:"+ product);
		System.out.println("quotine:"+ quotine);
		
		sc.close();
		
		
	}
}
