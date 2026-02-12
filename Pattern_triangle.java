package PST;
import java.util.Scanner;
public class Pattern_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of star:");
		int num=sc.nextInt();
        for(int i=0;i<=num;i++) {
        	System.out.print("*");
        	for(int j=1;j<=i;j++) {
            	System.out.print(" "+"*");
            }
        	System.out.println();
        }
 
	}

}
