public class Tester3 {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        Point p = new Point(1.5, 2.5);
        double r = 10;
        Circle c2 = new Circle(p, r);

        Circle c3 = new Circle(p, 20);

        //Lay quan he giua c1, c2
        int result = c1.getRelationship(c2);
        System.out.println("Result: " + result);
        int result2 = c2.getRelationship(c3);
    }
}
