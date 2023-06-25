package Chapter03.StarbussEx2;

public class Whip implements CondimentDecorator {

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return beverage.cost() + .10;
	}
}
