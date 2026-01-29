package project1.pst;
import java.util.Scanner;
public class leepyear {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the year:");
		int year=scanner.nextInt();
		if(year%4==0)
		if(year%100!=0)
		if(year%400==0)
		{
			System.out.print(year+"is leep year");
							
			}else {
				System.out.print(year+"is not a leep year");
			}
		scanner.close();
		}
		
		
		

	}


