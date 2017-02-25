package bridge.design.pattern.model;

/**
 * @author rajesh
 * 
 * bridge pattern decouple abstraction and implementation.bridge pattern prefers composition over inheritance.
 * composition is black box while inheritance is white box.
 * 
 * A vehicle can be either manufactured or assembled.this can be designed by either composition(bridge pattern) or inheritance.
 *
 */
public abstract class Vehicle {
	
	protected Workshop workshop; // vehicle has workshop as composition
	protected String name;
	
	public String getName(){
		return this.name;
	}
	
	public String producedBy(){
		return workshop.producedBy();
	}
	
	protected Vehicle(String name,Workshop workshop){
		this.workshop = workshop;
		this.name = name;
	}

}
