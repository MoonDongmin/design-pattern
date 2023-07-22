package Chapter12.observer;

public class Quackologist implements Observer {
 
	public void update(QuackObservable duck) {
		System.out.println("꽥꽥 학자: " + duck + " 가 방금 소리 냈다");
	}
}
