package code;

import mylib.Validation;

public class Sinhvien {
    private int ma;
    private String ten;
    private String gioitinh;

    public Sinhvien() {
        ma = 0;
        ten = "";
        gioitinh = "";
    }

    public Sinhvien(int ma, String ten, String gioitinh) {
        this.ma = ma;
        this.ten = ten;
        this.gioitinh = gioitinh;

    }

    public Sinhvien(Sinhvien stu) {
        ma = stu.ma;
        ten = stu.ten;
        gioitinh = stu.gioitinh;
    }

    public void setTen(String ten) {
        if (this.ten != null && !this.ten.isEmpty()) {
            this.ten = ten;
        }
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getTen() {
        ten = ten.toUpperCase();
        return ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public int getMa() {
        return ma;
    }

//    public void nhap() {
//        Scanner sc = new Scanner(System.in);
//
//        boolean tmp = false;
//        do {
//            try {
//                System.out.print("Nhap ma cua sinh vien: ");
//                ma = sc.nextInt();
//                if (ma < 0) throw new Exception();
//                tmp = true;
//            } catch (InputMismatchException e) {
//                System.out.println("Nhap sai ma roi.....");
//            } catch (Exception er) {
//                System.out.println("Some thing wrong....");
//            }
//        } while (!tmp);
//
//        sc = new Scanner(System.in);
//        System.out.print("Nhap ten sinh vien: ");
//        ten = sc.nextLine();
//
//        sc = new Scanner(System.in);
//        System.out.print("Nhap gioi tinh sinh vien: ");
//        gioitinh = sc.nextLine();
//    }

    public void nhapSV() {
        boolean flag = false;
        do {
            try {
                ma = (int) Validation.inputNumber("Nhap ma: ", 1, 1000);
                ten = Validation.inputString("Nhap ten: ", "^[a-zA-Z]+([a-zA-Z ]+)*$");
                gioitinh = Validation.inputString("Nhap gioi tinh: ", "^([nN][aA][mM])|([nN][uU])");
                flag = true;
            } catch (Exception ex) {
                System.out.println("Nhap thong tin sai....");
            }
        } while (!flag);

    }

    public void xuat() {
        System.out.println("Ma sv: " + ma);
        System.out.println("Ten sv: " + ten);
        System.out.println("Gioi tinh sv: " + gioitinh);
    }
}
