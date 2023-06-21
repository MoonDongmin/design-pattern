package Chapter03;

import Chapter03.Beverage;

public class Espresso extends Beverage {
	public Espresso() {
		description = "에스프레소";
	} // description이라는 인스턴스 변수는 Beverage로 상속

	public double cost() {
		return 1.99;
	}
}