package project1.pst;

public class arithmetic_in_oops {

	public static void main(String[] args) {
		int a=5,b=10;
			System.out.println(add(a,b));
            System.out.println(subtract(a,b));
            System.out.println(multiplication(a,b));
            System.out.println(division(a,b));
	}


public static int add(int a,int b) {
	return a+b;
}
public static int subtract(int a,int b) {
	return a-b;
}
public static int multiplication(int a,int b) {
	return a*b;
}
public static int division (int a,int b) {
	return a/b;
}
}