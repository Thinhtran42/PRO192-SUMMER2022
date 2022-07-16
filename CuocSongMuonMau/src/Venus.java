public class Venus extends Plant implements Food{
    private int size;

    public Venus(String name, int year, int size) {
        super(name, year);
        this.size = size;
    }

    @Override
    public void eatBug() {
        System.out.println("eat " + Food.quantity + " bugs/a week");
    }
}
