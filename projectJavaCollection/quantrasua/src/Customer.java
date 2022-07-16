import mylib.Validation;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<Order> orderedList;

    public Customer() {
        id = 0;
        name = "";
        orderedList = new ArrayList<>();
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        orderedList = new ArrayList<>();
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

    // nhập thông tin customer
    public void inputCus() {
        while (true) {
            try {
                System.out.println("Nhập thông tin khách hàng: ");
                id = (int) Validation.inputNumber("Input id [1-100]: ", 1, 100);
                name = Validation.inputString("Input name of Customer: ", "^[aA-zZ ]+$");
                break;
            } catch (Exception er) {
                System.out.println("Input Customer again");
            }
        }
    }

    // add order cua khach vo list order
    public boolean addOrderToCus(Order order) {
        return orderedList.add(order);
    }

    @Override
    public String toString() {
        System.out.println("Info customer: ");
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //ham nay de display thong tin order cua khach
    public void viewOrderOfCus() {
        for (Order o : orderedList) {
            o.viewCart();
        }
    }
    public Order findOrder(int id){
        for (int i = 0; i < orderedList.size(); i++){
            if (orderedList.get(i).getId() == id){
                return orderedList.get(i);
            }
        }
        return null;
    }
}
