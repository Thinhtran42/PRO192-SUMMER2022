package src;

import mylib.Validation;

public class Student {
    private int ma;
    private String ten;
    private String gioitinh;
    private Laptop laptop;
    private boolean isNguoiYeu;


    public Student() {
        ma = 0;
        ten = "";
        gioitinh = "";
        laptop = new Laptop();
        isNguoiYeu = false;
    }

    public Student(int ma, String ten, String gioitinh, Laptop laptop, boolean isNguoiYeu) {
        this.ma = ma;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.laptop = laptop;
        this.isNguoiYeu = isNguoiYeu;
    }


    public int getMa() {
        return this.ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return this.gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Laptop getLaptop() {
        return this.laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public boolean getIsNguoiYeu() {
        return this.isNguoiYeu;
    }

    public void setIsNguoiYeu(boolean isNguoiYeu) {
        this.isNguoiYeu = isNguoiYeu;
    }

    public void inputStudent() {
        laptop.inputLaptop();
        while (true) {
            try {
                ma = Validation.inputNumber("Nhap ma: ");
                ten = Validation.inputString("Nhap Ten: ", "^[a-zA-Z]+([a-zA-Z ]+)*$");
                gioitinh = Validation.inputString("Nhap gioi tinh: ", "^([nN][aA][mM])|([nN][uU])");
                isNguoiYeu = Validation.inputBoolean("Nhap true/false: ");
            } catch (Exception e) {
                System.out.println("Error, Input again");
            }
        }
    }

    public void outputStudent() {
        System.out.println("Ma: " + ma);
        System.out.println("Ten: " + ten);
        System.out.println("Gioi tinh: " + gioitinh);
        laptop.outputLaptop();
    }

}
