package Chapter12.factory;

public class MallardDuck implements Quackable {
 
	public void quack() {
		System.out.println("꽥꽥");
	}
 
	public String toString() {
		return "Mallard Duck";
	}
}
