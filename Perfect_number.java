package PST;
import java.util.Scanner; 
public class Perfect_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
			
		}
if(num==sum) {
				System.out.print(sum +" "+"= the  is perfect number");
			}
			else {
				System.out.print(sum +" "+"= the  is not perfect number");
			}
	}

}
