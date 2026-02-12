package PST;

public class A_Z_asciivalue {

	public static void main(String[] args) {
		int start=65;
		int end=90;
		alpha.ascii(start, end);

	}

}
class alpha{
	static void ascii(int start,int end) {
		for(int i=start;i<=end;i++) {
			System.out.println("ascii value of"+" "+i+" "+"character:"+(char)i);
		}
	}
}