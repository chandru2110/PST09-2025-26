package PST;

public class AsciiValue_a_z {

	public static void main(String[] args) {
		int start=97;
		int end=122;
         alpha(start,end);
	}
static void alpha(int start,int end) {
	for(int i=start;i<=end;i++) {
		System.out.println("the value ascii value of "+i+" is the character of:"+(char)i);
	}
}
}
