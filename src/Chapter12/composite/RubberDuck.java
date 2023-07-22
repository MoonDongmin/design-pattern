package Chapter12.composite;

public class RubberDuck implements Quackable {
 
	public void quack() {
		System.out.println("삑삑");
	}
  
	public String toString() {
		return "Rubber Duck";
	}
}
