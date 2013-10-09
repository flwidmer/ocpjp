package polymorphism;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Overriding {
	public static void main(String[] args) throws IOException {
		B b= new B();
		b.fun();
	}
}

class A {
	void fun() throws IOException {

	}
}

class B extends A {
	@Override
	void fun() throws IOException {
		File f = new File("../chapter1/size");
		FileReader fr = new FileReader(f);
		fr.read();
	}
}