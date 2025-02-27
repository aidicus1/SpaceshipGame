package ShipParts;

import java.util.ArrayList;

import ShipParts.Weapons.Gun;

public class Ship {
	private Hull hull;
	private ArrayList<Turret> turretList = new ArrayList<>();
	private double cost;
	public Ship(Hull shipHull,Gun gun,int numGuns,int numCase,int numTurrets,int turretArmour,int caseArmour) {
		hull = shipHull;
		for(int i = 0;i<=numTurrets;i++) {
			turretList.add(new Turret(turretArmour,gun,numGuns,numCase,caseArmour));
		}
		cost = shipHull.getCost();
		for (Turret turret:turretList) {
			cost = cost+turret.getCost();
		}
	}
	public double getCost() {
		return cost;
	}
}
