public class VarargsLast {
	public static void main(String[] args) {
		A[] a = new A[] { new A(), new A() };
		B[] b = new B[] { new B() };

		slip(a);
		slip(b);
		slip(b,a);
		slip(null,null);
	}
	public static void slip(B[]... b) {
		System.out.println("vb");
	}
	public static void slip(A[]... a) {
		System.out.println("va");
	}
	public static void slip(C[]... C) {
		System.out.println("vc");
	}
	
	public static void slip(Object o) {
		System.out.println("o");
	}
}

class A  {

}

class B extends A {
}
class C extends B{
	
}