public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        System.out.println("Nhap phan so 1 : ");
        ps1.nhap();
        System.out.println("Nhap phan so 2 : ");
        ps2.nhap();

        //Cong phan so
        PhanSo cong = ps1.congPS(ps2);

        //Tru phan so
        PhanSo tru = ps1.truPS(ps2);

        //Nhan phan so
        PhanSo nhan = ps1.nhanPS(ps2);

        //Chia Phan so
        PhanSo chia = ps1.chiaPS(ps2);


        //Xuat ra man hinh cac phep toan 2 phan so:
        System.out.println("Phep cong phan so : ");
        cong.xuat();

        System.out.println("Phep tru phan so : ");
        tru.xuat();

        System.out.println("Phep nhan phan so : ");
        nhan.xuat();

        System.out.println("Phep chia phan so : ");
        chia.xuat();


    }
}
