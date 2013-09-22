package polymorphism;

public class Test {
	public static void main(String[] args) {
		Subclass a = new Subclass();
		System.out.println(a.getName());
		System.out.println(a.name);
		System.out.println(a.stat());
		Superclass b = a;
		System.out.println(b.getName());
		System.out.println(b.name);
		System.out.println(b.stat());
	}
}
