package prob3;

public class Manager extends Employee {
	private int bonus;
	public Manager(int id, String n, int s, int bonus) {
		super(id, n,s);
		this.setBonus(bonus);
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
