import java.util.Scanner;
public class CalculatingChange {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        final int QUARTER_VALUE = 25;
        final int DIME_VALUE = 10;
        final int NICKEL_VALUE = 5;
        
        int quarters;
        int dimes;
        int nickels;
        int changeRemaining;
        
        System.out.print("Please enter the amount of change to be returned (a number between 0 & 99) : ");
        int change = scnr.nextInt();
        scnr.close();
        
        quarters = change / QUARTER_VALUE;
        changeRemaining = change % QUARTER_VALUE;
        dimes = changeRemaining / DIME_VALUE;
        changeRemaining %= DIME_VALUE;
        nickels = changeRemaining / NICKEL_VALUE;
        changeRemaining %= NICKEL_VALUE;
        
        System.out.println("The change for " + change + " cents is: ");
        System.out.println("    " + quarters + " Quarters");
        System.out.println("    " + dimes + " Dimes");
        System.out.println("    " + nickels + " Nickels");
        System.out.println("    " + changeRemaining + " Pennies");
        System.out.print("Next time, Bring exact change!");

    }

}
