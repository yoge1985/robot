package Robot;

public class Security extends Robot {

    private static int itemID = 0;

    public Security() {
        itemID++;
        type = "security";
        cost = 1200;
        height = 280;
        weight = 40;
    }

    @Override
    void description() {
        super.description();
        System.out.println("helps to protect the house. can buy weapons for extra protection.");
    }
}
