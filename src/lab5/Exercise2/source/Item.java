package lab5.Exercise2.source;

public class Item {
	String name;

	private Item(String name) {
		this.name = name;
	}

	static Item newItem(String name) {
		return new Item(name);
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}
