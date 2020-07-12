package Robot;

public class HouseKeeping extends Robot {

    private static int itemID = 0;


    public HouseKeeping() {
        //item ID is incremented every time a new instance of robot is instantiated.
        itemID++;

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
