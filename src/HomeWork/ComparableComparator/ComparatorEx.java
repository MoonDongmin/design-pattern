package HomeWork.ComparableComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {
        Comparator<Fruit> MaxPrice = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o2.getPrice() - o1.getPrice();
            }
        };

        Fruit f1 = new Fruit("사과", 2000);
        Fruit f2 = new Fruit("수박", 20000);
        Fruit f3 = new Fruit("딸기", 6000);

        List<Fruit> list = new ArrayList<Fruit>();
        list.add(f1);
        list.add(f2);
        list.add(f3);

        System.out.println("정렬 전");
        for (Fruit fruit : list) {
            System.out.println(fruit.name + " " + fruit.price);
        }
        System.out.println(list);


        System.out.println("정렬 후");
        Collections.sort(list, MaxPrice);
        for (Fruit fruit : list) {
            System.out.println(fruit.name + " " + fruit.price);
        }

    }
}