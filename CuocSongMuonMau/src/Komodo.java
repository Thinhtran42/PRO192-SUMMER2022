public class Komodo extends Animal implements Food{
    public Komodo() {
    }

    public Komodo(String name, String gender) {
        super(name, gender);
    }

    @Override
    public void eatBug() {
        System.out.println("eat " + Food.quantity + "bugs/a day");
    }

}
