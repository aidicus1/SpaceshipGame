package ShipParts;

public class FuelTank {
	private double capacity;
	private double cost;
	private int durability;
	private double currentFuel;
	public FuelTank(double Capacity, int Durability) {
		capacity = Capacity;
		durability = Durability;
		currentFuel = Capacity;
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
