package Base;

public abstract class Character {
	
	private String name;
	private String type;
	
	public Character(String n, String t) {
		name = n;
		type = t;
	}
	
	protected String getName() {
		return name;
	}
	
	public String toString() {
		return " [Name] " + name + " [Type] " + type;
	}
	
	abstract String Weapon();
	
	abstract String Move();		

}
