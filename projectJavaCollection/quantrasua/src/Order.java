import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private String orderDate;
    private List<Item> selectedItems;
    private List<Integer> quantityList;
    //constructor
    public Order() {
        orderDate = "";
        selectedItems = new ArrayList<>();
        quantityList = new ArrayList<>();
    }

    public Order(int id, String orderDate) {
        this.id = id;
        this.orderDate = orderDate;
        selectedItems = new ArrayList<>();
        quantityList = new ArrayList<>();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // hàm này để add item và quantity của item vô list item đã chọn
    public boolean addToCart(Item item, int quantity) {
        // Todo: hay them item vao selectedItems
        selectedItems.add(item);
        //va them quantity vao quantityList
        quantityList.add(quantity);
        // add order vao item song song
        item.addToOrder(this);
        return false;
    }

    //ham nay de xuat ds item da chon
    public void viewCart() {
        if (selectedItems.size() > 0) {
            System.out.println("Items have selected: ");
            for (int i = 0; i < selectedItems.size(); i++) {
                System.out.println(selectedItems.get(i));
                System.out.println("quantity of item:  " + quantityList.get(i));
            }
        } else System.out.println("no item have selected");
    }

    //ham nay tinh total tien phai tra cho 1 don cua khach hang
    public int getTotalMoney() {
        //Todo: cong tat ca price * quantity cua cac item trong selectedItems
        if (selectedItems.size() > 0) {
            int sumMoney = 0;
            for (int i = 0; i < selectedItems.size(); i++) {
                int totalMoney = selectedItems.get(i).getPrice() * quantityList.get(i);
                sumMoney += totalMoney;
            }
            return sumMoney;
        } else return 0;
    }

    // ham nay de view
    public void displayOrder() {
        this.viewCart();
        int money = this.getTotalMoney();
        System.out.println("Total money must pay: " + money + "$");
    }

}
