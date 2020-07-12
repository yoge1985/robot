package Robot;

import CleaningUtensils.Cleaningware;

public class HouseKeeping extends Robot {

    private static int itemID = 001;
    private Cleaningware cleaningware;


    public HouseKeeping() {
        //item ID is incremented every time a new instance of robot is instantiated.
        itemID++;

        type = "HouseKeeping";
        cost = 800;
        height = 200;
        weight = 30;
        cleaningware = new Cleaningware();
    }

    @Override
    void description() {
        super.description();
        System.out.println("robot cleans the house with use of available cleaning tools. needs to be charged overnight");
    }

    public int getItemID() {
        return itemID;
    }

    public void purchaseCleaningWares(int itemNo){
        if (itemNo == 1){
            cleaningware.purchaseBroom();
        }else if (itemNo == 2){
            cleaningware.purchaseGloves();
        }else if (itemNo == 3){
            cleaningware.purchaseHoover();
        }
    }
}
