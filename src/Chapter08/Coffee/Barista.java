package Chapter08.Coffee;

public class Barista {
 
	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		System.out.println("차를 만드는 중...");
		tea.prepareRecipe();
		System.out.println("커피를 만드는 중...");
		coffee.prepareRecipe();
	}
}
