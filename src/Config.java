import java.util.Scanner;

public class Config {

    public static void main(String[] args) {

        String pi4 = "\nRecommendation: Raspberry Pi 4";
        String beagleBone = "\nRecommendation: BeagleBone Black";
        String jetsonTX2 = "\nRecommendation: NVIDIA Jetson TX4";
        String jetsonNano = "\nRecommendation: NVIDIA Jetson Nano";
        String udoo = "\nRecommendation: UDOO Quad";
        String tinker = "\nRecommendation: ASUS Tinker";
        String rockpro = "\nRecommendation: RockPro 64";
        String coral = "\nRecommendation: Google Coral";
        String odyssey = "\nRecommendation: ODYSSEY - X86J4125800";
        String odroid = "\nRecommendation: Odroid C2";

        Scanner scan = new Scanner(System.in);

        System.out.println("\nWelcome to Embedded Configuration Assistant. " +
                "Please answer the following questions in order for us to find your desired SBC");

        while (true) {

                System.out.println("\nIs your budget above a $100?: ");
                String budget = scan.nextLine();

                System.out.println("Do you need more than 4GB of RAM?: ");
                String ram = scan.nextLine();

                System.out.println("Do you need WiFi?: ");
                String wifi = scan.nextLine();

                System.out.println("Is machine learning required?: ");
                String ml = scan.nextLine();


                if (budget.equalsIgnoreCase("No") && ram.equalsIgnoreCase("No") && wifi.equalsIgnoreCase("Yes") && ml.equalsIgnoreCase("Yes")) {
                    System.out.println(pi4);
                    System.out.println("\nOR ");
                    System.out.println(rockpro);

                    System.out.println("\nPlease enter 1 to re-run the program again or 0 to exit");
                    String input = scan.nextLine();

                    if (input.equals("1")){
                        continue;
                    }else {
                        break;
                    }

                } else if (budget.equalsIgnoreCase("Yes") && ram.equalsIgnoreCase("Yes") && wifi.equalsIgnoreCase("Yes") && ml.equalsIgnoreCase("Yes")) {
                    System.out.println(jetsonTX2);
                    System.out.println("\nPlease enter 1 to re-run the program again or 0 to exit");
                    String input = scan.nextLine();

                    if (input.equals("1")){
                        continue;
                    }else {
                        break;
                    }
                } else if (budget.equalsIgnoreCase("No") && ram.equalsIgnoreCase("No") && wifi.equalsIgnoreCase("No") && ml.equalsIgnoreCase("Yes")) {
                    System.out.println(jetsonNano);
                    System.out.println("\nPlease enter 1 to re-run the program again or 0 to exit");
                    String input = scan.nextLine();

                    if (input.equals("1")){
                        continue;
                    }else {
                        break;
                    }
                } else if (budget.equalsIgnoreCase("No") && ram.equalsIgnoreCase("No") && wifi.equalsIgnoreCase("No") && ml.equalsIgnoreCase("No")) {
                    System.out.println(beagleBone);
                    System.out.println("\nPlease enter 1 to re-run the program again or 0 to exit");
                    String input = scan.nextLine();

                    if (input.equals("1")){
                        continue;
                    }else {
                        break;
                    }
                } else if (budget.equalsIgnoreCase("Yes") && ram.equalsIgnoreCase("No") && wifi.equalsIgnoreCase("Yes") && ml.equalsIgnoreCase("No")) {
                    System.out.println(udoo);
                    System.out.println("\nPlease enter 1 to re-run the program again or 0 to exit");
                    String input = scan.nextLine();

                    if (input.equals("1")){
                        continue;
                    }else {
                        break;
                    }
                } else if (budget.equalsIgnoreCase("No") && ram.equalsIgnoreCase("No") && wifi.equalsIgnoreCase("Yes") && ml.equalsIgnoreCase("No")) {
                    System.out.println(odroid);
                    System.out.println("\nPlease enter 1 to re-run the program again or 0 to exit");
                    String input = scan.nextLine();

                    if (input.equals("1")){
                        continue;
                    }else {
                        break;
                    }
                } else if (budget.equalsIgnoreCase("Yes") && ram.equalsIgnoreCase("Yes") && wifi.equalsIgnoreCase("Yes") && ml.equalsIgnoreCase("No")) {
                    System.out.println(odyssey);
                    System.out.println("\nPlease enter 1 to re-run the program again or 0 to exit");
                    String input = scan.nextLine();

                    if (input.equals("1")){
                        continue;
                    }else {
                        break;
                    }
                } else if (budget.equalsIgnoreCase("Yes") && ram.equalsIgnoreCase("No") && wifi.equalsIgnoreCase("No") && ml.equalsIgnoreCase("Yes")) {
                    System.out.println(tinker);
                    System.out.println("\nPlease enter 1 to re-run the program again or 0 to exit");
                    String input = scan.nextLine();

                    if (input.equals("1")){
                        continue;
                    }else {
                        break;
                    }
                } else if (budget.equalsIgnoreCase("Yes") && ram.equalsIgnoreCase("No") && wifi.equalsIgnoreCase("Yes") && ml.equalsIgnoreCase("Yes")) {
                    System.out.println(coral);
                    System.out.println("\nPlease enter 1 to re-run the program or 0 to exit");
                    String input = scan.nextLine();

                    if (input.equals("1")){
                        continue;
                    }else {
                        break;
                    }
                } else {
                    System.out.println("\nThe configuration does not exist! Enter 1 to try again or 0 to exit");
                    String input = scan.nextLine();
                    if (input.equalsIgnoreCase("0")){
                        break;
                    }
                }
            }


    }


}
