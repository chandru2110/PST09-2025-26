package PST;
import java.util.Scanner;
public class Niven_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(temp>0) {
		sum+=temp%10;
			temp/=10;
			
		}
		if(n%sum==0) {
			System.out.print(n+" "+"this is niven number");
		}
		else {
			System.out.print(n+" "+"this is not niven number");
		}

	}

}
