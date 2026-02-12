package PST;
import java.util.Scanner;
public class Patern_problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of star:");
		int plus=sc.nextInt();
        vert np=new vert();
        np.star(plus);
        np.star1(plus);
	}

}
class pattern{
	public static void star(int plus) {
		System.out.println("vertical:");
		for(int i=0;i<=plus;i++) {
			System.out.println("*");
			
		}
	}
}
class vert extends pattern{
	public static void star1(int plus) {
		System.out.println("horizontal:");
		for(int i=0;i<=plus;i++) {
			System.out.print("*");
		}
	}
}