package PST;
import java.util.Scanner;
public class Largest_number {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number1:");
	int num1=sc.nextInt();
	System.out.print("enter the number2:");
	int num2=sc.nextInt();
	System.out.print("enter the number3:");
	int num3=sc.nextInt();
    if(num1>=num2 && num1>=num3) {
    	System.out.print(num1+" "+"is the largest number");
    }
    else if(num2>=num1 && num2>=num3 ) {
    	System.out.print(num2+" "+"is the largest number");
    }
    else {
    	System.out.print(num3+" "+"is the largest number");
    }
	}

}
