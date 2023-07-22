package Chapter12.factory;

public class RubberDuck implements Quackable {
 
	public void quack() {
		System.out.println("삑삑");
	}
  
	public String toString() {
		return "Rubber Duck";
	}
}
