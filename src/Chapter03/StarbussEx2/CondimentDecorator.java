package Chapter03.StarbussEx2;


public interface CondimentDecorator extends Beverage {
	// 데코레이터가 감쌀 음료를 나타내는 beverage객체 저장.
	@Override
	String getDescription();
	// 첨가물 데코레이터에 getDescription() 메소드를 새로 구현하도록 만들 계획
}