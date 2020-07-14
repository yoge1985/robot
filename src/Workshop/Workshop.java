package Workshop;

import Robot.HouseKeeping;

import java.util.Scanner;

public class Workshop {

    public static void main(String[] args) {
        //create a factory that produces robots. there are 2 types of robot: 1- housekeeping 2- security.
        //both robots have option to purchase necessary goods i.e. security could purchase weapons; housekeeping could
        //purchase cleaning wares.
        //common behaviours incl. sleep, walk and talk.
        //program prompts user to choose a type of robot and option to purchase additional items (as mentioned above).
        //returns total cost of purchase.

        System.out.println("choose type of robot");
        System.out.println("1 - housekeeping\n2 - security");
        boolean quit = false;
        do {
            Scanner scanner = new Scanner(System.in);
            int selected = scanner.nextInt();
            scanner.nextLine();
            if (selected == 1){
                HouseKeeping houseKeeping = new HouseKeeping();
                System.out.println("you purchased HouseKeeping robot");
                System.out.println("COST = " + houseKeeping.getCost());
                System.out.println("=======================");
                System.out.println("would you like to purchase cleaning material (Press 0 =  NO or 1 - YES)");
                int pressed = scanner.nextInt();
                scanner.nextLine();
                if (pressed == 0){
                    System.out.println("no items purchased");
                    quit = true;
                    break;
                }else {
                    selectCleaningItems();
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("how many would you like (1-10)");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    houseKeeping.purchaseCleaningWares(choice,quantity);
                    quit = true;
                }
        }

        }while (!quit);

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
