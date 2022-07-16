import mylib.Validation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Item implements Comparable<Item> {  //comparable : sort 1 tham so
    private int id;
    private String name;
    private int price;
    private List<Order> selectedOrders;


    public static Comparator<Item> myCompare = new Comparator<Item>() {
        @Override
        public int compare(Item o1, Item o2) {
            if (o1.getName().compareTo(o2.getName()) > 0) return 1;
            else if (o1.getName().compareTo(o2.getName()) < 0) return -1;
            return 0;
        }
    };

    public Item() {
        id = 0;
        name = "";
        price = 0;
        selectedOrders = new ArrayList<>();
    }

    public Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        selectedOrders = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price + "$" +
                '}';
    }

    // hàm này để input item
    public void input() {
        //TODO
        while (true) {
            try {
                id = (int) Validation.inputNumber("Input id of Item: ", 1, 100);
                name = Validation.inputString("Input name of Item: ", "^[aA-zZ ]+$");
                price = (int) Validation.inputNumber("Input price of Item: ", 1, 1000);
                break;
            } catch (Exception er) {
                System.out.println("Input again");
            }
        }
    }

    // hàm này để add item vô order
    public boolean addToOrder(Order order) {
        return selectedOrders.add(order);
    }

    // hàm này để view order của khách
    public void viewOrder() {
        if (selectedOrders.size() > 0) {
            for (Order o : selectedOrders) {
                System.out.println("Orders: ");
                System.out.println(o);
            }
        } else System.out.println("not found");
    }

    //hàm này để có thể sort trong itemList
    @Override
    public int compareTo(Item o) {
        if (this.id > o.getId()) return 1; //1 la dong y swap 2 object trong mang
        else if (this.id < o.getId()) return -1;
        return 0;
    }


}
