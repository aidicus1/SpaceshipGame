package Testing;

import ShipBuilder.TestShip;
import ShipParts.Ship;

public class Main {

	public static void main(String[] args) {
		Ship ship1 = (new TestShip()).ship();
		System.out.println(ship1.getCost());

	}

}
