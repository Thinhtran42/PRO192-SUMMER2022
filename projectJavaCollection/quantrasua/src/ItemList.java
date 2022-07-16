import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ItemList {
    private List<Item> list;

    public ItemList() {
        list = new ArrayList<>();
    }

    // ham nay de add 1 item vao list
    public boolean addItem(Item item) {
        return list.add(item);
    }

    // ham nay de xuat cac item ra man hinh
    public void displayAll() {
        // duyet cac phan tu trong list
        for (Item item : list) {
            System.out.println(item);
        }
    }

    // ham nay de tim item dua vao id
    //tra ve vi tri tim thay
    public int findItem(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public Item searchItem(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return list.get(i);
            }
        }
        return null;
    }

    // ham nay de sua thong tin item dua vao id
    public boolean updateItem(int id) {
        int pos = findItem(id);
        if (pos > 0) {
            Item it = new Item();
            it.input();
            list.set(pos, it);
            return true;
        }
        return false;
    }

    //ham nay de xoa item dua vao id
    public boolean removeItem(int id) {
        int pos = findItem(id);
        if (pos > 0) {
            list.remove(pos);
            return true;
        }
        return false;
    }

    // ham sort cac item dua vao id
    public void sortById() {
        Collections.sort(list);
    }

    //ham nay de sap xep danh sach tang dan theo name
    public void sortByName() {
        Collections.sort(list, Item.myCompare);
    }

}



















