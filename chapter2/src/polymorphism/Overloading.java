package polymorphism;

public class Overloading {
	public static void main(String[] args) {
		Bar b = new Bar();
		Number n = 1;
		Integer i = 1;
		b.doIt(i);
	}
}

class Foo {
	void doIt(Number i) {
		System.out.println("number");
	}
}

class Bar extends Foo {

	void doIt(Integer i) {
		System.out.println("integer");
	}
}
