package Robot;

public abstract class Robot implements Actions {

    protected String type;
    protected String itemID;
    protected int weight;
    protected int height;
    protected double cost;
    protected boolean batteryCharged;

    void description(){
        System.out.println("this is an autonomous robot designed for specific tasks");

    }

    @Override
    public void sleep() {
        if (!batteryCharged){
            System.out.println("battery is running low. now in sleep mode");
            System.out.println("ZZZZZZZZZZZZZZZ");
        }

    }

    @Override
    public void walk() {
        System.out.println("robot is walking!");
    }

    @Override
    public void talk() {
        System.out.println("robot is talking!");
    }
}
