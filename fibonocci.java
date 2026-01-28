package project1.pst;
import java.util.Scanner;
public class fibonocci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0; int b=1;
		System.out.println("fibonicci series");
         for(int i=1;i<=n;i++) {
        	 System.out.println(a+"");
        	 int next =a+b;
        	 a=b;
        	 b=next;
         }
         sc.close();
	}

}
