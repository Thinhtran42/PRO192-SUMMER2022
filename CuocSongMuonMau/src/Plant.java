public class Plant extends LivingBeing {
    private int year;

    public Plant(String name, int year) {
        super(name);
        this.year = year;
    }

    @Override
    public void grow() {
        System.out.println("grow by light");
    }
}
