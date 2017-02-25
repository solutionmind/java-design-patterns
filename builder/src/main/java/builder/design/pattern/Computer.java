package builder.design.pattern;

/**
 * @author 212594358
 * 
 * @definition Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns 
 * when the Object contains a lot of attributes - 
 * Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, 
 * the type of arguments are same and from client side its hard to maintain the order of the argument.
 * Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to 
 * send as NULL.
 * If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
 *
 */
public class Computer {

	// required parameters
	private String HDD;
	private String RAM;

	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public String getHDD() {
		return HDD;
	}

	public void setHDD(String hDD) {
		HDD = hDD;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public void setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public void setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}
	
	private Computer(ComputerBuilder builder) {
		this.HDD=builder.HDD;
		this.RAM=builder.RAM;
		this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled=builder.isBluetoothEnabled;
	}
	
	// Builder Class
	public static class ComputerBuilder {

		// required parameters
		private String HDD;
		private String RAM;

		// optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}
}
