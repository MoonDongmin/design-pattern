package Chapter03.StarbussEx2;

import Chapter03.Starbuzz.Beverage;

public class Soy implements CondimentDecorator {
	private Beverage beverage;

	public Soy(Chapter03.StarbussEx2.Beverage beverage3) {
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
