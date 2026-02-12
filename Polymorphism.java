package PST;

public class Polymorphism {

	public static void main(String[] args) { 
		Student ns=new Student();
		ns.number();
		name();
}
	public static void name() {
		System.out.println("vibin");
		
		
	}
}
class Student{
public static int number() {
	Box nk=new Box();
	nk.mike();
	
	int a=10;
	System.out.println(a);
	return a;
}
}
class Box{
public static int mike() {
	int nike=14;
	System.out.println(nike);
	return nike;
}
}