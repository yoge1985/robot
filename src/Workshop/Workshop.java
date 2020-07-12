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

        System.out.println("choose type of robot: (press 0 - quit");

        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        scanner.nextLine();

        while (!quit){

            switch (select){
                case 0:
                    quit = true;
                    break;
                case 1:
                    HouseKeeping houseKeeper = new HouseKeeping();
                    break;
                case 2:
                    Security security = new Security();
                    break;
            }
        }





    }
}
