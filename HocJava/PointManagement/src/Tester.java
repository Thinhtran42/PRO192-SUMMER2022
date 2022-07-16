
public class Tester {
    public static void main(String[] args) {
        //Nhap 2 diem
        Point a = new Point();
        a.input();
        Point b = new Point();
        b.input();
        System.out.println("Point a : ");
        a.output();
        System.out.println("Point b : ");
        b.output();

//        tinhs kcach a, b
        double kc = a.getDistance(b.x, b.y);
        System.out.println("khoang cach ab : " + kc);
        double kc2 = b.getDistance(a);
        System.out.println("Khoang cach ab 2 : " + kc2);
    }
}
