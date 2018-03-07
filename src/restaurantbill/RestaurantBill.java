/*
 * Nicole Tao
 * RestaurantBill.java
 * This program will calculate and print the bill at a restaurant
 * March 6th, 2018
 */

package restaurantbill;

/**
 *
 * @author nitao5001
 */
import java.text.DecimalFormat;

public class RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double meal, tax, hst, totalCost;
        
        meal = 11.85;
        tax = 0.13;
        hst = meal*tax; //This will calculate the tax of the meal
        totalCost = meal + hst; //Ths is the total amount that must be paid
        
        DecimalFormat bill = new DecimalFormat ("$##.##");
        
        //This SOP will print out the restaurant Bill
        System.out.println("Restaurant Bill\n***************\n");
        System.out.println("Meal:\t" + bill.format(meal));
        System.out.println("HST:\t" + bill.format(hst));
        System.out.println("Total:\t" + bill.format(totalCost));
    } 
    
}
