package Robot;

public class Security extends Robot {

    public Security() {
        type = "security";
        cost = 1200;
        height = 280;
        weight = 40;
    }

    @Override
    void description() {
        super.description();
        System.out.println("helps to protect the house. can add to the weapons for extra protection.");
    }
}
