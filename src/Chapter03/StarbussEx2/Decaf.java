package Chapter03.StarbussEx2;

public class Decaf implements Beverage {
	String description = "Decaf Coffee";

	@Override
	public String getDescription() {
		return description;
	}

	public double cost() {
		return 1.05;
	}
}

