package ShipParts;

import java.util.ArrayList;

public class Hull {
	private ArrayList<FuelTank> tanksList = new ArrayList<>();
	private ArrayList<Reactor> reactorList = new ArrayList<>();
	int armour;
	double cost = 0;
	public Hull(FuelTank Tanks, int TankNum,Reactor Reactors, int ReactorNum,int Armour) {
		for(int i=1;i<=TankNum;i++) {
			tanksList.add(new FuelTank(Tanks.getCapacity(),Tanks.getDurability()));
		}
		for(int i=1;i<=ReactorNum;i++) {
			reactorList.add(new Reactor(Reactors.getCapacity(),Reactors.getDurability()));
		}
		for (FuelTank tank:tanksList) {
			cost = cost + tank.getCost();
		}
		for (Reactor reactor:reactorList) {
			cost = cost +reactor.getCost();
		}
		cost = cost*armour*armour;
	}
	public double getCost() {
		return cost;
	}
}
