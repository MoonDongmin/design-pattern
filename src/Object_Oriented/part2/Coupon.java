package Object_Oriented.part2;
/* 리스코프 치환의 예시
public class Coupon {
    public int calculateDiscountAmount(Item item) {
        if (!item.isDiscountAvailable()) // instanceof 연산자 사용 제거
            return 0;
        return item.getPrice() * discountRate;
    }
    // 특수한 Item 처리
//    public int calculateDiscountAmount(Item item) {
//      if (item instanceof SpecialItem) // LSP 위반 발생
//          return 0;
//
//      return item.getPrice() * discountRate;
//  }
}


// 이렇게 item을 구분해 주어야함

public class item {

    // 변화되는 기능을 상위 타입에 추가
    public boolean isDiscountAvailable() {
        return true;
    }
    ...
}

public class SpecialItem extends item {
    // 하위 타입에 맞게 오버라이딩
    @Override
    public boolean isDiscountAvailable() {
        return false;
    }
}

 */
