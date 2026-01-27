import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("mark1:");
		int mark1=sc.nextInt();
		System.out.println("mark2:");
		int mark2=sc.nextInt();
		System.out.println("mark3:");
		int mark3=sc.nextInt();
		 int sum=mark1+mark2+mark3;
		 System.out.println("total:"+sum);
		 double average=sum/3;
		 System.out.println("Average:"+average);
		
		sc.close();
		
		
	}
}
