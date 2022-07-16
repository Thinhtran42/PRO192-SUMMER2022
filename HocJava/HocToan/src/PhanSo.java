import mylib.Validation;

import java.util.Scanner;

public class PhanSo {
    int tuso;
    int mauso;

    public PhanSo() {
        tuso = 0;
        mauso = 0;
    }

    public PhanSo(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public PhanSo(PhanSo Ps) {
        tuso = Ps.tuso;
        mauso = Ps.mauso;
    }

    public int getTuSo() {
        return tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

//    public void nhap() {
//        //todo: dung Scanner de nhap tu so mau so
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhap tu so: ");
//        tuso = sc.nextInt();
//        sc = new Scanner(System.in);
//        System.out.println("Nhap mau so: ");
//        mauso = sc.nextInt();
//    }

    public void nhap(){
        while (true) {
            try {
                tuso = Validation.inputNumber("Nhap tu so: ");
                mauso = Validation.inputNumber("Nhap mau so: ");

                if (mauso == 0) throw new Exception();
                break;
            } catch (Exception er) {
                System.out.println("Nhap sai format phan so roi ! ");
            }
        }
    }

    public void xuat() {
        System.out.println("Phan so la " + tuso + "/" + mauso);
    }

    public PhanSo congPS(int tuso, int mauso) {
        int tmp1 = this.tuso * mauso + this.mauso * tuso;
        int tmp2 = this.mauso * mauso;

        PhanSo kq = new PhanSo();
        kq.tuso = tmp1;
        kq.mauso = tmp2;
        return kq;
    }

    public PhanSo congPS(PhanSo P) {
        int tmp1 = tuso * P.mauso + mauso * P.tuso;
        int tmp2 = mauso * P.mauso;

        PhanSo kq = new PhanSo();
        kq.tuso = tmp1;
        kq.mauso = tmp2;
        return kq;
    }

    public PhanSo truPS(int tuso, int mauso) {
        int tmp1 = this.tuso * mauso - this.mauso * tuso;
        int tmp2 = this.mauso * mauso;

        PhanSo kq = new PhanSo();
        kq.tuso = tmp1;
        kq.mauso = tmp2;
        return kq;
    }

    public PhanSo truPS(PhanSo P) {
        int tmp1 = tuso * P.mauso - mauso * P.tuso;
        int tmp2 = mauso * P.mauso;

        PhanSo kq = new PhanSo();
        kq.tuso = tmp1;
        kq.mauso = tmp2;
        return kq;
    }

    public PhanSo nhanPS(int tuso, int mauso) {
        int tmp1 = this.tuso * tuso;
        int tmp2 = this.mauso * mauso;

        PhanSo kq = new PhanSo();
        kq.tuso = tmp1;
        kq.mauso = tmp2;
        return kq;
    }

    public PhanSo nhanPS(PhanSo P) {
        int tmp1 = tuso * P.tuso;
        int tmp2 = mauso * P.mauso;

        PhanSo kq = new PhanSo();
        kq.tuso = tmp1;
        kq.mauso = tmp2;
        return kq;
    }

    public PhanSo chiaPS(int tuso, int mauso) {
        int tmp1 = this.tuso * mauso;
        int tmp2 = this.mauso * tuso;

        PhanSo kq = new PhanSo();
        kq.tuso = tmp1;
        kq.mauso = tmp2;
        return kq;
    }

    public PhanSo chiaPS(PhanSo P) {
        int tmp1 = tuso * P.mauso;
        int tmp2 = mauso * P.tuso;

        PhanSo kq = new PhanSo();
        kq.tuso = tmp1;
        kq.mauso = tmp2;
        return kq;
    }
}
