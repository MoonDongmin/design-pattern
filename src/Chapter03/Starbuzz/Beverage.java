package Chapter03.Starbuzz;

public abstract class Beverage {
	String description = "제목 없음";

	public String getDescription() {
		return description;
	}

	public abstract double cost(); //서브 클래스에서 구현해야함
}

