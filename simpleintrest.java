package project1.pst;
import java.util.Scanner;
public class simpleintrest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
			System.out.print("enter the price:");
			int P=scanner.nextInt();
			
			System.out.print("enter the rate:");
			int R=scanner.nextInt();
		
			System.out.print("enter the time");
			int T=scanner.nextInt();
			
		
		int SI=( P* R*  T)/100;
		{
			System.out.print(SI);
		}
			
		}
	}
		

	


