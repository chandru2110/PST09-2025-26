package PST;
import java.util.Scanner;
public class Sum_asciivalue {

	public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	System.out.print("enter the sentence:");
		String str=sc.nextLine();
		suming(str);
	}
static void suming(String str) {
	int sum=0;
	for(int i=0;i<=str.length()-1;i++) {
		char alpha=str.charAt(i);
		sum+=alpha;	
	}
	System.out.println(sum);
}
}
