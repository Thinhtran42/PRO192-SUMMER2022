package dto;

import java.util.Scanner;

public class Laptop {
    class USBPort {
        private String brand;
        private String technology;

        public USBPort(){

        }
        public USBPort(String brand, String technology) {
            this.brand = brand;
            this.technology = technology;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getTechnology() {
            return technology;
        }

        public void setTechnology(String technology) {
            this.technology = technology;
        }

        @Override
        public String toString() {
            return "brand " +  brand + ", Technology " + technology;
        }
    }

    private int id;
    private String name;
    private int price;
    private USBPort port = null;

    public Laptop() {
        id = 0;
        name = "";
        price = 0;
        port = new USBPort();
    }

    public Laptop(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        port = new USBPort("abc", "cai gi do");
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

    public USBPort getPort() {
        return port;
    }

    public void setPort(USBPort port) {
        this.port = port;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        // Todo
    }

    public void onLaptop() {
        VNRemote remote = new VNRemote() {
            @Override
            public void onDevice() {
                System.out.println("open device");
            }

            @Override
            public void offDevice() {
                System.out.println("shutdown device");
            }
        };
        remote.onDevice();
        System.out.println("Chuc ban 1 ngay lam viec hieu qua");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", port=" + port +
                '}';
    }
}
