package Robot;

public abstract class Robot {

    protected String type;
    protected int weight;
    protected int height;
    protected double cost;

    void description(){
        System.out.println("this is an autonomous robot designed for specific tasks");

    }
}
