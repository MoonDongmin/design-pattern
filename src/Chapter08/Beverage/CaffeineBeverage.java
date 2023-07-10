package Chapter08.Beverage;

public abstract class CaffeineBeverage {
  
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
 
	abstract void brew();
  
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("물을 끓이는");
	}
  
	void pourInCup() {
		System.out.println("컵에 따르는중");
	}
}
