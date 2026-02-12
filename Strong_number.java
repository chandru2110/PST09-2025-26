package PST;
import java.util.Scanner;
public class Strong_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int num=sc.nextInt();
		int n=num;
		int sum=0;
		int d;
		while(num>0) {
			int fact=1;
			d=num%10;
			for(int i=1;i<=d;i++) {
				fact=fact*i;
				
			}
			sum=sum+fact;
			num=num/10;
		}
		if(n==sum) {
			System.out.print("the number is strong:"+" "+n);
		}
		else{
			System.out.print("the number is not strong:"+" "+n);
		}
	}

}
