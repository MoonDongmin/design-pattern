package Chapter06.SimpleRemote;

public class GarageDoor {

	public GarageDoor() {
	}

	public void up() {
		System.out.println("차고 문 개방");
	}

	public void down() {
		System.out.println("차고 문 닫힘");
	}

	public void stop() {
		System.out.println("차고 문 정지");
	}

	public void lightOn() {
		System.out.println("차고 불이 켜졌습니다");
	}

	public void lightOff() {
		System.out.println("자고 불이 꺼졌습니다");
	}
}
