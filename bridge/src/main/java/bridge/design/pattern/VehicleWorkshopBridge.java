package bridge.design.pattern;

import bridge.design.pattern.model.Assembled;
import bridge.design.pattern.model.Bike;
import bridge.design.pattern.model.Car;
import bridge.design.pattern.model.Manufacture;
import bridge.design.pattern.model.Vehicle;

public class VehicleWorkshopBridge {

	public static void main(String[] args) {
		Vehicle audi = new Car("audi",new Manufacture());
		System.out.println(audi.getName() + "::" + audi.producedBy());
		
		Vehicle mercedes = new Car("mercedes",new Assembled());
		System.out.println(mercedes.getName() + "::" + mercedes.producedBy());
		
		Bike pulser = new Bike("pulser",new Manufacture());
		System.out.println(pulser.getName() + "::" + pulser.producedBy());
		
		Bike honda = new Bike("honda",new Assembled());
		System.out.println(honda.getName() + "::" + honda.producedBy());
	}

}
