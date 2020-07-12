package Robot;

public class HouseKeeping extends Robot {

    public HouseKeeping() {
        type = "HouseKeeping";
        cost = 800;
        height = 200;
        weight = 30;
    }

    @Override
    void description() {
        super.description();
        System.out.println("robot cleans the house with use of available cleaning tools. needs to be charged overnight");
    }
}
