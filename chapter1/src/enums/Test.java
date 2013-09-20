package enums;

public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CoffeeSize size = CoffeeSize.LARGE;
		System.out.println(size.getSize());
		size.setSize(3);
		System.out.println(size.getSize());
		CoffeeSize size2 = CoffeeSize.LARGE;
		System.out.println(size2.getSize());

		for (CoffeeSize cs : CoffeeSize.values()) {
			System.out.println(cs.toString());

		}
	}
}
