package Chapter03.StarbussEx2;

public interface Beverage {
	public String getDescription();

	public abstract double cost(); //서브 클래스에서 구현해야함
}

