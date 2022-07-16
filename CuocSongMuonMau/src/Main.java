import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c = 0;
        LivingBeing obj = null;
        do {
            System.out.println("1. Tao 1 con komodo");
            System.out.println("2. Tao 1 cay bat ruoi");
            System.out.println("3. Test all method cua 1 trong 2 cai nay");
            System.out.println("Nhap lua chon");
            Scanner sc = new Scanner(System.in);
            c = sc.nextInt();
            switch (c) {
                case 1:
                    obj = new Komodo("Komodo indo", "F");
                    System.out.println("done");
                    break;
                case 2:
                    obj = new Venus("Cay bat ruoi nhiet doi", 2, 10);
                    System.out.println("done");
                    break;
                case 3:
                    if (obj != null) {
                        obj.useWater();
                        System.out.println("========================");
                        obj.grow();
                        System.out.println("========================");

                        if (obj instanceof Animal){
                            ((Animal)obj).run();
                        }
                        Food tmp = (Food)obj;
                        tmp.eatBug();
                    }
                    break;
            }
        } while (c <= 3);
    }
}
