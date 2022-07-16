package CarManager;

public class Car {
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    //Constructor
    public Car() {
        colour = "";
        enginePower = 0;
        convertible = false;
        parkingBrake = false;
    }

    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

    public Car(Car car) {
        colour = car.colour;
        enginePower = car.enginePower;
        convertible = car.convertible;
        parkingBrake = car.parkingBrake;
    }

    //Getters
    public String getColour() {
        return colour;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    //Setters

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public void pressStartButton() {
        // print out the message
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }

    public void output() {
        System.out.println("The color of the car: " + colour);
        System.out.println("The engine power of the car: " + enginePower);
        System.out.println("The convertible of the car: " + convertible);
        System.out.println("The parking brake of the car: " + parkingBrake);
    }
}
