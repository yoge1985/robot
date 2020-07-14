package Robot;

import CleaningUtensils.Cleaningware;

public class HouseKeeping extends Robot {

    private static int itemID = 001;
    private Cleaningware cleaningware;
    private double totalCost;


    public HouseKeeping() {
        //item ID is incremented every time a new instance of robot is instantiated.
        itemID++;

        type = "HouseKeeping";
        cost = 800;
        height = 200;
        weight = 30;
        cleaningware = new Cleaningware();

    }

    public double getCost(){
        return cost;
    }

    @Override
    void description() {
        super.description();
        System.out.println("robot cleans the house with use of available cleaning tools. needs to be charged overnight");
    }

    public int getItemID() {
        return itemID;
    }

    public void purchaseCleaningWares(int itemNo,int quantity) {
        if (itemNo == 1) {
            double totalAmount = cleaningware.purchaseBroom(quantity) + this.cost;
            System.out.println("TOTAL COST = " + totalAmount);
        } else if (itemNo == 2) {
            double totalAmount = cleaningware.purchaseGloves(quantity) + this.cost;
            System.out.println("TOTAL COST = " + totalAmount);

        } else if (itemNo == 3) {
            double totalAmount = cleaningware.purchaseHoover(quantity) + this.cost;
            System.out.println("TOTAL COST = " + totalAmount);

        }
    }

}
