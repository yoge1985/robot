package Workshop;

import Robot.HouseKeeping;
import Robot.Security;

import java.util.Scanner;

public class Workshop {

    public static void main(String[] args) {
        //create a factory that produces robots. there are 2 types of robot: 1- housekeeping 2- security.
        //both robots have option to purchase necessary goods i.e. security could purchase weapons; housekeeping could
        //purchase cleaning wares.
        //common behaviours incl. sleep, walk and talk.
        //program prompts user to choose a type of robot and option to purchase additional items (as mentioned above).

        System.out.println("choose type of robot: (press 0 - quit)");
        System.out.println("1 - housekeeping\n2 - security");

        boolean quit = false;

        while (!quit){
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();
            scanner.nextLine();

            switch (select){
                case 0:
                    quit = true;
                    break;
                case 1:
                    HouseKeeping houseKeeper = new HouseKeeping();
                    int ID = houseKeeper.getItemID();
                    System.out.println(ID);
                    System.out.println("you have selected housekeeping");
                    System.out.println("would you like to purchase cleaning items");
                    selectCleaningItems();
                    int choice = scanner.nextInt();
                    houseKeeper.purchaseCleaningWares(choice);
                    break;
                case 2:
                    Security security = new Security();
                    System.out.println("you have selected security");
                    System.out.println("would you like to purchase weapons");
                    selectWeapon();
                    int choice1 = scanner.nextInt();
                    scanner.nextLine();
                    security.purchaseWeapon(choice1);
                    break;
            }
        }

    }
    private static void selectCleaningItems(){
        System.out.println("select from the following items:");
        System.out.println("1- broom\n2 - gloves\n3 - hoover");
    }

    private static void selectWeapon(){
        System.out.println("select from the following weapons:");
        System.out.println("1 - gun\n2 - stick\n3 - handcuffs");
    }
}
