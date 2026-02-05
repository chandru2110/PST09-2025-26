package project1.pst;

public class methodovrloading {

	public static void main(String[] args) {
		int a= 5; 
		int b=10;
	    System.out.println(add(a,b));
	    System.out.println(mike.sub(10, 5));   // inherited
	    System.out.println(mike.divide(10, 2)); // own

	}
	public static int add (int a,int b) {
	return a+b;
}

}
class gus{
	public static int sub(int a,int b) {
		return a-b;
	}
}
class mike extends gus{
	public static int divide(int a ,int b) {
		return a/b;
				
	}
}
