package Chapter03.StarbussEx2;

public class Espresso implements Beverage {
	String description = "에스프레소";

	@Override
	public String getDescription() {
		return description;
	}

	public double cost() {
		return 1.99;
	}
}