package src;

import mylib.Validation;

public class CPU {
    private String make;
    private String gen;
    private int core;

    public CPU() {
        make = "";
        gen = "";
        core = 0;
    }

    public CPU(String make, String gen, int core) {
        this.make = make;
        this.gen = gen;
        this.core = core;
    }


    /**
     * @return String return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return String return the gen
     */
    public String getGen() {
        return gen;
    }

    /**
     * @param gen the gen to set
     */
    public void setGen(String gen) {
        this.gen = gen;
    }

    /**
     * @return String return the core
     */
    public int getCore() {
        return core;
    }

    /**
     * @param core the core to set
     */
    public void setCore(int core) {
        this.core = core;
    }

    public void input() {
        while (true) {
            try {
                make = Validation.inputString("Input make of CPU: ", "^[a-zA-Z ]+$");
                gen = Validation.inputString("Input gen of CPU: ", "^[0-9]th$");
                core = Validation.inputNumber("Input core of CPU: ");
            } catch (Exception e) {
                System.out.println("Error, Input again");
            }
        }
    }

    public void output() {
        System.out.println("Make: " + make);
        System.out.println("Gen: " + gen);
        System.out.println("Core: i"+ core);
    }
}
