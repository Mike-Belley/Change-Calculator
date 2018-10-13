import java.util.Scanner;
public class EuroChange {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Please enter the amount of change in euro cents to be returned (a number between 0 & 499) :");
        int change = scnr.nextInt();
        scnr.close();
        
        System.out.println("Your change for " + change + " euro cents is: ");
        System.out.println("    " + change/200 + " \u20ac" + "2");
        change %= 200;
        System.out.println("    " + change/100 + " \u20ac" + "1");
        change %= 100;
        System.out.println("    " + change/50 + " \u20ac" + ".50");
        change %= 50;
        System.out.println("    " + change/20 + " \u20ac" + ".20");
        change %= 20;
        System.out.println("    " + change/10 + " \u20ac" + ".10");
        change %= 10;
        System.out.println("    " + change/5 + " \u20ac" + ".05");
        change %= 5;
        System.out.println("    " + change/2 + " \u20ac" + ".02");
        change %= 2;
        System.out.print("    " + change/1 + " \u20ac" + ".01");
        change %= 1;
        
    }

}
