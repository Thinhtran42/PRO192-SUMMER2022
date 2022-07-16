public class Main {
    public static void main(String[] args) {
        DogMap x = new DogMap();
        x.addDog(new Dog(20, "Phong"));
        x.addDog(new Dog(10, "Hung"));
        x.addDog(new Dog(15, "Phi"));
        x.addDog(new Dog(23, "Phuc"));
        x.addDog(new Dog(20, "Tester"));
        x.displayAll();

        x.killDog(15);
        System.out.println("-- Sau khi lam phi 7 mon: ");
        x.displayAll();
    }
}