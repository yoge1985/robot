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

    public void purchaseBroom(){
        cost = 2.5;
        System.out.println("you have purchased a broom");
        System.out.println("COST = " + cost);
    }

    public void purchaseGloves(){
        cost = 1.5;
        System.out.println("you have purchased gloves");
        System.out.println("COST = " + cost);
    }

    public void purchaseHoover(){
        cost = 85;
        System.out.println("you have purchased a hoover");
        System.out.println("COST = " + cost);
    }
}
