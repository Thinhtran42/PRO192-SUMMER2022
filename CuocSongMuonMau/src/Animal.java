public class Animal extends LivingBeing{
    private String gender;
    public Animal(){
        super();
        gender = "";
    }

    public Animal(String name, String gender) {
        super(name);
        this.gender = gender;
    }
    public void run(){
        System.out.println("RUnn");
    }

    @Override
    public void grow() {
        System.out.println("grow by food");
    }
}
