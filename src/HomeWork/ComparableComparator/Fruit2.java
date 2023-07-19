package HomeWork.ComparableComparator;

public class Fruit2 implements Comparable<Fruit2> {
    private String name;
    private int price;

    public Fruit2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int compareTo(Fruit2 fruit2) {
        if (this.price == fruit2.price) {
            return 0;
        } else if (this.price < fruit2.price) {
            return -1;
        } else {
            return 1;
        }
    }
}
