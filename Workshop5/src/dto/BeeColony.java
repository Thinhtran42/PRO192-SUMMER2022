package dto;

public class BeeColony extends Colony implements Role {
    private String type;

    public BeeColony() {
        super();
        type = "";
    }

    public BeeColony(int size, String place, String type) {
        super(size, place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void communicateByTool() {

    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }

    @Override
    public String toString() {
        return "the colony’s type is " + type + ", size is about " + super.size + ", and " +
                "the place is " + super.place;
    }
}
