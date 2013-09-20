package enums;

public enum EnumWithSpecificClassBody {
	NORMAL, ANOTHER, WEIRD {
		@Override
		public String getCode() {
			return "A";
		}

		public void getDirty() {
			System.out.println("here");

		}
	};

	public String getCode() {
		return "B";
	}
}
