package HomeWork.ComparableComparator;


public class ComparableEx {
    public static void main(String[] args) {
        Fruit2 f1 = new Fruit2("사과",2000);
        Fruit2 f2 = new Fruit2("수박", 20000);
        Fruit2 f3 = new Fruit2("딸기", 6000);

        System.out.println("사과와 수박 값 비교");
        System.out.println(f1.compareTo(f2));
    }
}
