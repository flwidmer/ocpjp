package access.b;

import access.a.A;

public class B extends A {
	@Override
	protected void protectedMethod() {
		// TODO Auto-generated method stub
		super.protectedMethod();
	}

	public void method() {
		protectedMethod();
	}
}
