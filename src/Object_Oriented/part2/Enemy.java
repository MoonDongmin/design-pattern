package Object_Oriented.part2;
/* 개방 폐쇄 원칙 잘못된 코드 예시
public class Enemy extends Character {
    private int pathPattern;

    public Enemy(int pathPattern) {
        this.pathPattern = pathPattern;
    }

    // 아래는 개방 폐쇄 원칙을 깨뜨리는 코드, 비슷한 if-else 블록이 존재
    public void draw() {
        if (pathPattern == 1) {
            x += 4;
        } else if (pathPattern == 2) {
            y += 10;
        } else if (pathPattern == 4) {
            x += 4;
            y += 10;
        }
        ...; // 그려주는 코드
    }

    private PathPattern pathPattern;

    public Enemy(PathPattern pathPattern) {
        this.pathPattern = pathPattern;
    }

    public void draw() {
        int x = pathPattern.nextX();
        int y = pathPattern.nextY();
        ...; // 그려주는 코드
    }
}

   // 이렇게 바꿔야지 좋은 코드
    public void drawCharacter(Character character) {
        if (character instanceof Missile) { // 타입 확인
            Missile missile = (Missile) character; // 타입 다운 캐스팅
            missile.drawSpecific();
        } else {
            character.draw();
        }
    }

 */
