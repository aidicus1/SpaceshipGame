package ShipParts.Weapons;

public class Gun {
	private String name;
	private Round round;
	private int cost;
	private int durability;
	private int maxDurability;
	public Gun(String Name, Round chambered, int Durability) {
		name = Name;
		round = chambered;
		durability = Durability;
		cost=round.getCost()*Durability*Durability;
		maxDurability=durability;
	}
	public String getName() {
		return name;
	}
	public Round getRound() {
		return round;
	}
	public int getMaxDurability() {
		return maxDurability;
	}
	public int getCalibre() {
		return round.getCalibre();
	}
	public int getCost() {
		return cost;
	}
	public Boolean Fire() {
		durability = durability-getCalibre();
		if (durability>0) {
			return true;
		}
		return false;
	}
	
}
