package Chapter12.composite;

public class DuckCall implements Quackable {
 
	public void quack() {
		System.out.println("꽉꽉");
	}
 
	public String toString() {
		return "Duck Call";
	}
}
