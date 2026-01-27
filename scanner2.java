import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the float value");
		double radius=sc.nextDouble();
		
		 double PI=3.14;
		 double area=PI*(radius*radius);
		 System.out.println("area of the circle"+ area);
		
		
		sc.close();
		
		
	}
}
