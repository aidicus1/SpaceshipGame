package ShipParts;

import java.util.ArrayList;

import ShipParts.Weapons.Gun;

public class Turret {
	private int armour;
	private ArrayList<Casemate> casemates = new ArrayList<>();
	private double cost;
	public Turret(int Armour, Gun gun,int numGuns,int num,int caseArmour) {
		armour = Armour;
		for (int i =1; i<=num;i++) {
			casemates.add(new Casemate(caseArmour,gun,numGuns));
		}
		double tempCost =casemates.getLast().getCost();
		cost=tempCost*tempCost*num*Armour*Armour;
	}
	public double getCost() {
		return cost;
	}
}
