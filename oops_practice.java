package project1.pst;

public class oops_practice {

    public static void main(String[] args) {
    	int a=5;
    	int b=10;
    	int c=15;
    	 System.out.println(add(a,b));
    	 System.out.println(add(a,b,c));
        
    }

    
    public static int add(int a,int b) {
        return a+b;
    }

    
    public static int add(int a, int b, int c) {
       return a+b+c;
    }
}
