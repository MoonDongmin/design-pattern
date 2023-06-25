package Chapter03.StarbussEx2;

public class Soy implements CondimentDecorator {

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
