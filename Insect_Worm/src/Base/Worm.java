package Base;

public class Worm extends Character {
	private String weapon;
	private String move;
	private boolean leg;
	
	protected Worm(String n, String t, String w, String m, boolean l) {
		super(n,t);
		weapon=w;
		move = m;
		leg = l;
	}
	
	public String getWeapon() { return weapon; }
	public String getMove() { return move; }
	public boolean getLeg() { return leg; }
	
	public void setWeapon(String w)  { weapon = w; }
	public void setMove(String m) { move = m; }
	public void setLeg(boolean l) { leg = l; }
	
	public String toString() {
		return super.toString() + " [Weapon] " + weapon + " [Move] " + move + " [Leg] " + leg;
	
	}
	
	@Override
	String Weapon() {
		return weapon;
	}
	
	@Override
	String Move() {
		return move;
	}
}
