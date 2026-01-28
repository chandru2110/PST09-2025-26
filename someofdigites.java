package project1.pst;
import java.util.Scanner;
public class someofdigites {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		int sum=0;
		while(num > 0){
		sum=sum+(num%10);
		num=num/10;
		
		}
		System.out.println("sum of digites is:"+sum);
		sc.close();
		
		

	}

}
