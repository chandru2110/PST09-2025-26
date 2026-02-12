package PST;

public class Polymorpism_arithmetic {

	public static void main(String[] args) {
		int a=10,b=20;
		Multi mu=new Multi();
		Divi di=new Divi();
		System.out.println("a+b="+add(a,b));
		System.out.println("a-b="+sub(a,b));
		System.out.println("a*b="+mu.mul(a,b));
		System.out.println("a/b="+di.div(a,b));
	}
	public static int add(int a,int b) {
		return a+b;

	}
	public static int sub(int a,int b) {
		return a-b;
	}	
}
class Multi{
public static int mul(int a,int b) {
	return a*b;
}
}
class Divi{
public static int div(int a,int b) {
	return a/b;
}
}