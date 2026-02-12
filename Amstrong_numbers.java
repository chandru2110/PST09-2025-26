package PST;
import java.util.Scanner;
public class Amstrong_numbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number:");
	    int n=sc.nextInt();
		int count = 0;
		int org=n;
		int sum=0;
		int temp=n;
		while(temp!=0) {
	         temp=temp/10;
	    	 ++count;
   		     	 }
		temp=n;
		while(temp>0) {
			int digit=temp%10;
			  int power=1;
			  for(int i=0;i<count;i++) {
				  power*=digit;
			  }
			  sum+=power;
			  temp/=10;
	    	 }
		if(sum==org) {
			System.out.print("this number is armstrong:"+org);
		}
		else {
			System.out.print("this number is not a armstrong:"+org);
		}
	    	 
	    	 
	    	 }
	    	 
	 
		

	

	
	}
