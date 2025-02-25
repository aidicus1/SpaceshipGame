package ShipParts;

import java.util.ArrayList;

import ShipParts.Weapons.Gun;

public class Casemate {
	private int armour;
	private ArrayList<Gun> guns = new ArrayList<>();
	private int cost;
	public Casemate(int Armour, Gun gun,int num) {
		armour = Armour;
		for (int i =1; i<=num;i++) {
			guns.add(new Gun(gun.getName(), gun.getRound(),gun.getMaxDurability()));
		}
		cost=gun.getCost()*gun.getCost()*num;
	}
}
