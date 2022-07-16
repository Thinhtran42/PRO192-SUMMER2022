import com.sun.org.apache.xerces.internal.impl.dv.ValidatedInfo;
import mylib.Validation;

import java.util.Scanner;

public class Point {
    double x;
    double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point P) {
        x = P.x;
        y = P.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //de nhap x, y tu ban phim
//    public void input() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input x: ");
//        x = sc.nextDouble();
//        sc = new Scanner(System.in);
//
//        System.out.println("input y: ");
//        y = sc.nextDouble();
//    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                x = Validation.inputNumber("Nhap diem x: ");
                y = Validation.inputNumber("Nhap diem y: ");
                break;
            } catch (Exception er){
                System.out.println("Nhap diem sai, hay nhap lai !");
            }
        }
    }

    public void output() {
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }

    //de tinh khaong cach 2 diem
    /*
        can co point 1 (x, y), point 2 (x, y)
     */
    public double getDistance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double getDistance(Point P) {
        return Math.sqrt((x - P.x) * (x - P.x) + (y - P.y) * (y - P.y));

    }
}
