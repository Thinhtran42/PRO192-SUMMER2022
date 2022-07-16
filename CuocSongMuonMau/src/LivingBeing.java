public abstract class LivingBeing {
    private String name;

    public LivingBeing(){

    }

    public LivingBeing(String name) {
        this.name = name;
    }

    public void useWater(){
        System.out.println("Use 2 lit / a day");
    }
    public abstract void grow();
}
