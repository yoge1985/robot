package WeaponsShop;

public class Weapons {

    private String gun;
    private String stick;
    private String handcuffs;
    private double cost;

    public Weapons() {
        this.gun = gun;
        this.stick = stick;
        this.handcuffs = handcuffs;
        this.cost = cost;
    }

    public void purchaseGun(){
        cost = 50;
        System.out.println("you have purchased a gun");
        System.out.println("COST = " + cost);
    }

    public void purchaseStick(){
        cost = 10;
        System.out.println("you have purchased a stick");
        System.out.println("COST = " + cost);
    }

    public void purchaseHandcuffs(){
        cost = 20;
        System.out.println("you have purchased handcuffs");
        System.out.println("COST = " + cost);
    }
}
