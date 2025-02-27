package ShipParts;

public class Reactor {
	private double capacity;
	private double cost;
	private int durability;
	public Reactor(double Capacity, int Durability) {
		capacity = Capacity;
		durability = Durability;
		cost = durability*durability*Math.log(Capacity+1);
	}
	public double getCost() {
		return cost;
	}
	public double getCapacity() {
		return capacity;
	}
	public int getDurability() {
		return durability;
	}
}
