public abstract class Toy {
	private String name;
	private int count;
	//constructors
	public Toy() {
		this.name ="";
		this.count = 1;
	}
	public Toy(String n) {
		this.name = n;
		this.count = 1;
	}
	//abstract method
	public abstract String getType();
	//modifiers
	public void setName(String n) {
		name = n;
	}
	public void setCount(int c) {
		count = c;
	}
	//accessors
	public String getName() {
		return name;
	}
	public int getCount() {
		return count;
	}
	public String toString() {
		return "Name: " + name + 
				" Count: " + count;
	}
}