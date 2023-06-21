package Chapter03;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	// Beverage의 레퍼런스가 들어있음.
	// 1. 감싸고자 하는 음료를 저장하는 인스턴스 변수
	// 2. 인스턴스 변수를 감싸고자 하는 객체로 설정하는 생성자
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}

	public double cost() {
		return beverage.cost() + .20;
	}
}