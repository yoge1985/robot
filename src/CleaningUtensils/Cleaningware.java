package CleaningUtensils;

public class Cleaningware {

    private String broom;
    private String gloves;
    private String hoover;
    private double cost;

    public Cleaningware() {
        this.broom = broom;
        this.gloves = gloves;
        this.hoover = hoover;
        this.cost = cost;
    }

    public double purchaseBroom(int quantity){
        if (quantity > 0){
            cost = 2.5 * quantity;
        }else {
            cost = 2.5;
        }
        System.out.println("you have purchased" + quantity + " broom(s)");
        System.out.println("COST = " + cost);
        return cost;
    }

    public double purchaseGloves(int quantity){
        if (quantity > 0){
            cost = 1.5 * quantity;
        }else {
            cost = 1.5;
        }
        System.out.println("you have purchased" + quantity + " gloves");
        System.out.println("COST = " + cost);
        return cost;
    }

    public double purchaseHoover(int quantity) {
        if (quantity > 0) {
            cost = 45 * quantity;
        } else {
            cost = 45;
        }
        System.out.println("you have purchased" + quantity + " hoover(s)");
        System.out.println("COST = " + cost);
        return cost;
    }

}
