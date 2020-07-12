package Robot;

import WeaponsShop.Weapons;

public class Security extends Robot {

    private static int itemID;
    private Weapons weapons;

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

    public void purchaseWeapon(int weaponNo){
        if (weaponNo == 1){
            weapons.purchaseGun();
        }else if (weaponNo == 2){
            weapons.purchaseStick();
        }else if (weaponNo == 3){
            weapons.purchaseHandcuffs();
        }
    }
}
