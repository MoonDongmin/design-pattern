package Chapter03.StarbussEx2;

public class DarkRoast implements Beverage {

	String description="Dark Roast Coffee";

	@Override
	public String getDescription() {
		return description;
	}

	public double cost() {
		return .99;
	}
}

