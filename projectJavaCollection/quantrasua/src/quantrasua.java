import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Scanner;

public class quantrasua {
    public static void main(String[] args) {
        ItemList listItem = new ItemList();

        // list item có sẵn ở quán
        listItem.addItem(new Item(5, "cafe sua", 1000));
        listItem.addItem(new Item(1, "cookie cream", 10000));
        listItem.addItem(new Item(3, "sua tuoi", 1));
        listItem.addItem(new Item(4, "tra sua tran chau", 5000));
        listItem.addItem(new Item(6, "tra sua tran chau", 4000));

        Customer cus = null;
        Order order = null;
        Invoice invoice = new Invoice();
        Item itemSelected = null;

        int choice = 0;
        do {
            menuOptions();
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    listItem.sortById();
                    listItem.displayAll();
                    break;
                case 2:
                    Item item = new Item();
                    item.input();
                    if (listItem.addItem(item)) System.out.println("added");
                    break;
                case 3:
                    cus = new Customer();
                    cus.inputCus();
                    System.out.println("added");
                    break;
                case 4:
                    if (cus != null)
                        System.out.println(cus);
                    else System.out.println("not found");
                    break;
                case 5:
                    System.out.println("Menu của quán trà sữa");
                    listItem.sortById();
                    listItem.displayAll();
                    System.out.print("Id của item khách chọn: ");
                    int id = sc.nextInt();
                    itemSelected = listItem.searchItem(id);
                    if (itemSelected != null) {
                        System.out.print("Nhập số lượng khách chọn: ");
                        int quantity = sc.nextInt();
                        order = new Order();
                        order.addToCart(itemSelected, quantity);
                        System.out.println("added");
                    } else System.out.println("Không tìm thấy item trong quán");
                    break;
                case 6:
                    if (order != null)
                        order.displayOrder();
                    else System.out.println("Chưa có order");
                    break;
                case 7:
                    if (cus != null && order != null) {
                        invoice.displayInvoice();
                        System.out.println(cus);
                        order.displayOrder();
                    }
                    else System.out.println("Chưa có khách, chưa có order");
                    break;
            }

        } while (choice <= 7);
    }

    public static void menuOptions() {
        System.out.println("==============MENU==============");
        System.out.println("1. Menu của quán trà sữa ");
        System.out.println("2. Thêm item vào list item của quán");
        System.out.println("3. Nhập thông tin khách hàng đến mua ");
        System.out.println("4. Xuất thông tin khách hàng");
        System.out.println("5. Cho item vô order của khách hàng ");
        System.out.println("6. Xem danh sách order của khách");
        System.out.println("7. Xuất hóa đơn cho khách hàng");

        System.out.println("Nhập 1 số ..");
    }
}
