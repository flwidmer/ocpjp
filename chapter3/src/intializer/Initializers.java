package intializer;

public class Initializers extends Pre {
	public static void main(String[] args) {
		System.out.println("daa");
		short a = 5;
		int g = Fuu.A.g;
		Integer[] aa = new Integer[3];
		System.out.println(aa);
	}
	static {System.out.println("babaaa");}
	
	public enum Fuu {
		A,B;
		private int g;
	}
}

class Pre {
	static{System.out.println("dundun");}
}
