package ShipBuilder;

import java.util.ArrayList;

import ShipParts.FuelTank;
import ShipParts.Hull;
import ShipParts.Reactor;
import ShipParts.Ship;
import ShipParts.Turret;
import ShipParts.Weapons.Gun;
import ShipParts.Weapons.Round;

public class TestShip {
	private Round standardRound = new Round(5,"Standard");
	private Gun standardGun = new Gun("StandardGun",standardRound,500);
	private Reactor standardReactor = new Reactor(100,100);
	private FuelTank standardFueltank = new FuelTank(100,100);
	private Hull shipHull = new Hull(standardFueltank,2,standardReactor,4,3);
	private Ship standard = new Ship(shipHull,standardGun,1,2,3,2,2);

	public Ship ship() {
		return standard;
	}
}
