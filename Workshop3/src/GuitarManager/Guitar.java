package GuitarManager;

public class Guitar {
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;

    //Constructor

    //Default Constructor


    public Guitar() {
        serialNumber = null;
        price = 0;
        builder = null;
        model = null;
        backWood = null;
        topWood = null;
    }

    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber != null){
            this.serialNumber = serialNumber;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    //method of the Guitar class
    public void createSound(){
        System.out.println("The serial Number of the Guitar: " + this.getSerialNumber());
        System.out.println("The price of the Guitar: " + this.getPrice());
        System.out.println("The builder of the Guitar: " + this.getBuilder());
        System.out.println("The model of the Guitar: " + this.getModel());
        System.out.println("The back wood of the Guitar: " + this.getBackWood());
        System.out.println("The top wood of the Guitar: " + this.getTopWood());
    }
}
