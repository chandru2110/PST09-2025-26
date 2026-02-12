package PST;

public class Polymorpism_2method {

	public static void main(String[] args) {
		int a=10,b=40,c=74;
	
		System.out.println(add(a,b));
		System.out.print(add(a,b));

	}
	public static int add(int a,int b) {
		return a+b;

	}
	public static int add(int a,int b,int c) {
		return a+b;
    }
}