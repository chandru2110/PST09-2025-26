package PST;

public class Multilevel {

	public static void main(String[] args) {
		beast mrb=new beast();
		mrb.fhead();
		mrb.num();
		mrb.speed();
		mrb.put();
		mrb.mr();

	}

}
class jk{
	 public static void num() {
		System.out.println("hello brooski");
	}
}
class mg extends jk{
	public static void put(){
		System.out.println("hello every one");
	}
}
class ishow extends mg{
	public static void speed() {
		System.out.println("barking wowowow");
	}
}
class ksi extends ishow{
	public static void fhead() {
		System.out.println("big fore head");
	}
}
class beast extends ksi{
	public static void mr() {
		System.out.println("money builds");
	}
}