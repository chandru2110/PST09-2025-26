import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int a=sc.nextInt();
		System.out.println("enter the value");
		int b=sc.nextInt();
		 
		int Sum=a+b;
		int difference=a-b;
		int product=a*b;
		int quotine=a/b;
		 
		System.out.println("sum"+ Sum);
		System.out.println("difference"+ difference);
		System.out.println("product"+ product);
		System.out.println("quotine"+ quotine);
		
		sc.close();
		
		
	}
}
