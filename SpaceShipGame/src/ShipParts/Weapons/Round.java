package ShipParts.Weapons;

public class Round {
	private int calibre;
	private String name;
	private double cost;
	public Round(int Calibre,String Name) {
		calibre = Calibre;
		name = Name;
		cost = Calibre*Calibre;
	}
	public int getCalibre() {
		return calibre;
	}
	public String getName() {
		return name;
	}
	public double getCost() {
		return cost;
	}
}
