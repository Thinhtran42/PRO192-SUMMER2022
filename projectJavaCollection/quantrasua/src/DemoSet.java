//luu cac item co id khong duoc trung nhau

import java.util.Iterator;
import java.util.TreeSet;

public class DemoSet {
    private TreeSet<Item> tree;

    public DemoSet() {
        tree = new TreeSet<>();
    }

    //ham nay de them 1 item vao tree
    public boolean addItem(Item t) {
        return tree.add(t); //must have the method compareTo() in the class Item
    }

    //xuat cac item tang dan theo id
    public void displayAscItem() {
        for (Item t : tree) System.out.println(t);
    }

    //xuat cac item giam dan theo id
    public void displayDescItem() {
        Iterator<Item> i = tree.descendingIterator();
        while (i.hasNext()) { //kiem tra tree con phan tu hay khong
            System.out.println(i.next());
        }
    }
}
