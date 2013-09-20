package enums;

/**
 * Take enum values from files
 * @author fwi
 *
 */
public enum CoffeeSize {
	LARGE(Sizes.size1), LARGER(Sizes.size2);
	CoffeeSize(int s) {
		this.size = s;
	}

	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return this.name() + " " + getSize();
	}
}
