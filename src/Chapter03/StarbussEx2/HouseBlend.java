package Chapter03.StarbussEx2;

public class HouseBlend implements Beverage {
	String description = "하우스 블렌드 커피";

	@Override
	public String getDescription() {
		return description;
	}

	public double cost() {
		return .89;
	}
}