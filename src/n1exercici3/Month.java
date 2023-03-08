package n1exercici3;

public class Month {

	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public Month(String name) {
		this.name = name;

	}

	@Override
	public String toString() {
		return name;
	}

}