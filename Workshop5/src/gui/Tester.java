package gui;

import dto.*;

public class Tester {
    public static void main(String[] args) {
        Colony obj1 = new BeeColony(2000, "land","honey");
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();

        University obj2 = new University(100000, "FPT");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();

        Role df = new BeeColony(3000, "wasp","land");
        System.out.println(df);
        df.createWorker();

        df = new FPTUniversity(100000, "FPT", "Hanoi");
        System.out.println(df);
        df.createWorker();

    }
}
