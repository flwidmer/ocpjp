package access.a;

import java.util.TreeSet;

public class TestClass {
	static void getR(){

	}
}


class T extends TestClass{
	public static void main(String[] args) {

	}

	void a(){
		super.getR();
	}
}