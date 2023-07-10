package Chapter09.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();
        addItem("K&B 팬케이크 세트", "스크램블 에그와 토스트가 곁들여진 팬케이크",true, 2.99);
        addItem("레귤러 팬케이크 세트","달걀 프라이와 소시지가 곁들여진 팬캐이크",false, 2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems(){
        return (ArrayList<MenuItem>) menuItems;
    }
}
