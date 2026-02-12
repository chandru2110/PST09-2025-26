package PST;
import java.util.Scanner;
public class Count_number {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the number:");
      int num=sc.nextInt();
      int count=0;
      while(num!=0) {
         num=num/10;
    	 ++count;
    	 }
      System.out.println(count+" ");
    	}
	
    	   
	

}
