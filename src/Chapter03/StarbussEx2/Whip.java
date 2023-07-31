package Chapter03.StarbussEx2;

import Chapter03.Starbuzz.Beverage;

public class Whip implements CondimentDecorator {
	private Beverage beverage;

	public Whip(Chapter03.StarbussEx2.Beverage beverage2) {
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return beverage.cost() + .10;
	}
}
