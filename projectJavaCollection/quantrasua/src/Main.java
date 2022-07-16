public class Main {
    public static void main(String[] args) {
        DemoSet list = new DemoSet();
        // list item có sẵn ở quán
        list.addItem(new Item(5, "cafe sua", 1000));
        list.addItem(new Item(1, "cookie cream", 10000));
        list.addItem(new Item(3, "sua tuoi", 1));
        list.addItem(new Item(4, "tra sua tran chau", 5000));
        list.addItem(new Item(6, "tra sua tran chau", 4000));
        list.addItem(new Item(1, "cafe sua", 1000));

        list.displayDescItem();

    }
}
