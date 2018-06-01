/**********************************************************************************************
 * PROJECT: TripPlanner
 * 
 * AUTHOR: itshally
 * 
 * CREATE DATE: 6/1/2018
 * 
 * DESCRIPTION: a program that asks the user for some information about an international trip
 * 				 they are taking.
 **********************************************************************************************/
package main;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class TripPlanner {
	
	public static final Scanner input = new Scanner(System.in);
	public static final DecimalFormat decimal = new DecimalFormat(".##");
	public static final SimpleDateFormat time = new SimpleDateFormat("HH:mm");
	
	public static void main(String[] args) {
		
		//PART 1 - GREETING
		greeting();
		//PART 2 - TRAVEL TIME AND BUDGET
		travelTimeAndBudget();
		//PART 3 - TIME DIFFERENCE
		timeDifference();
		//PART 4 - COUNTRY AREA
		countryArea();
	}
	
	// ----------------- > G R E E T I N G < ----------------- 
	public static void greeting() {
		System.out.print("Welcome to Vacation Planner!\n");
		System.out.print("Hello, what is your name? ");
		String name = input.nextLine();
		System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
		String destination = input.nextLine();
		System.out.print("Great! " + destination + " sounds like a great trip!\n");
		System.out.print("***********\n\n");
	}
	
	// ----------------- > T R A V E L  A N D  B U D G E T < ----------------- 
	public static void travelTimeAndBudget() {
		// ----- i disabled the RoundingMode on line 52 since i am following the instruction -----
		//turning off the rounding mode for decimals
		//decimal.setRoundingMode(RoundingMode.DOWN);
		
		System.out.print("How many days are you going to spend travelling ? ");
		int day = input.nextInt();
		System.out.print("How much money, in USD, are you planning to spend on your trip? ");
		double usd = input.nextDouble();
		System.out.print("What is the three letter currency symbol for your travel destination? ");
		String currencySymbol = input.next();
		System.out.print("How many " + currencySymbol + " are there in 1 USD? ");
		double convert = input.nextDouble();
		
		//calculations
		int hours = day * 24;
		int minutes = day * 1440;
		//line 67 is disabled because it is what i used for lines 75 to 78
		//double usdPerDay = usd / day; 
		double usdPerDay = (double)((int)(usd / day * 100)/100.0);
		double totalBudget = usd * convert;
		//line 71 is disabled because it is what i used for lines 75 to 78
		//double budgetPerDay = usd * convert / day;
		double budgetPerDay = (double)((int)((usd * convert / day) *100)/100.0);
		
		// ----- i disabled lines 75 to 78 because it is connected to the decimal format i was supposed to use -----
//		System.out.print("\n\nIf you are travelling for " + day + " day(s) that is the same as " + hours + " hours or " 
//						 + minutes + " minutes" + "\nIf you are going to spend $" + (int)usd + " USD that means per day you can spend up to $" 
//						 + decimal.format(usdPerDay) + " USD" + "\nYour total budget in " + currencySymbol + " is " + totalBudget + " " 
//						 + currencySymbol + ", which per day is " + decimal.format(budgetPerDay) + " " + currencySymbol);
	
		System.out.print("\n\nIf you are travelling for " + day + " day(s) that is the same as " + hours + " hours or " 
				 + minutes + " minutes" + "\nIf you are going to spend $" + (int)usd + " USD that means per day you can spend up to $" 
				 + usdPerDay + " USD" + "\nYour total budget in " + currencySymbol + " is " + totalBudget + " " 
				 + currencySymbol + ", which per day is " + budgetPerDay + " " + currencySymbol + "\n");
		System.out.print("***********\n\n");
	}
	
	// ----------------- > T I M E  D I F F E R E N C E < ----------------- 
	public static void timeDifference() {
		System.out.print("What is the time difference, in hours, between your home and your destination? ");
		int hours = input.nextInt();
		System.out.print("That means that when it is midnight at home it will be "  + (hours % 12) +
						 ":00 in your travel destination and when it is noon at home it will be " + (hours % 24 + 12) + ":00");
		System.out.print("***********\n\n");
	}
	
	// ----------------- > C O U N T R Y  A R E A < ----------------- 
	public static void countryArea() {
		System.out.print("What is the square area of your destination country in km2? ");
		int sqArea = input.nextInt();
		// ----- this part is my alternative, but since i am following the instruction i disabled this line 101 -----
		//System.out.print("In miles2 that is " + String.format("%.1f", (sqArea * 0.38610)));
		System.out.print("In miles2 that is " + (double)((int)((sqArea * 0.38610)*100))/100.0);
	}

}
