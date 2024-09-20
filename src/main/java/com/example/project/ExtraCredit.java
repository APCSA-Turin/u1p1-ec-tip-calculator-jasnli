package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

                //COPY AND PASTE YOUR CODE HERE 
        // CALCULATIONS BELOW
        double tip = cost * (percent / 100.0); // TIP MULTIPLIED BY PERCENT AS A DECIMAL
        double bill = tip + cost; // TOTAL BILL IS TIP + COST
        double perPersonCostBefore = cost / people; // DIVIDE FOR EACH PERSON
        double tipPerPerson = tip / people; // SAME AS ABOVE
        double perPersonCostAfter = bill / people; // SAME AS ABOVE


        // ROUNDING
        // FOR ROUNDING LINK : https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        // MULTIPLY BY 100 TO GET ALL THE NUMBERS I WANT TO KEEP AS INTEGERS
        // +0.5 TO CHECK FOR ANY NUMBER ABOVE 5
        // CUT OFF THOSE EXTRA DECIMALS
        // DIVIDE BY 100 TO GET THE NUMBERS BACK TO DECIMALS
        perPersonCostAfter = (int) ((perPersonCostAfter * 100) + 0.5) / 100.0;
        perPersonCostBefore = (int) ((perPersonCostBefore * 100) + 0.5) / 100.0;
        bill = (int) ((bill * 100) + 0.5) / 100.0;   
        tip = (int) ((tip * 100) + 0.5) / 100.0;   
        tipPerPerson = (int) ((tipPerPerson * 100) + 0.5) / 100.0;


        // FOR THE EC
        // LINK FOR THE STRING EQUAL CHECKING https://stackoverflow.com/questions/8484668/java-does-not-equal-not-working
        // I LOVE STACK OVERFLOW


        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("-------------------------------\n");
        result.append("Total bill before tip: "); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("$" + cost + "\n"); // COST
        result.append("Total percentage: ");
        result.append("" + percent + "%\n"); // PERCENTAGE
        result.append("Total tip: ");
        result.append("$" + tip + "\n"); // TIP
        result.append("Total Bill with tip: ");
        result.append("$" + bill + "\n"); // TOTAL BILL
        result.append("Per person cost before tip: ");
        result.append("$" + perPersonCostBefore + "\n"); // PER PERSON (BEFORE TIP)
        result.append("Tip per person: ");
        result.append("$" + tipPerPerson + "\n"); // TIP EACH PERSON PAYS
        result.append("Total cost per person: ");
        result.append("$" + perPersonCostAfter + "\n"); // PER PERSON AFTER
        result.append("-------------------------------\n");
        result.append("Items ordered:\n");
        result.append(items);

        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String items = "salmon\npizza\nsalad\nfrench fries\nmilkshake\n"; 

        //Your scanner object and while loop should go here
        
        // FOR THE EC
        // LINK FOR THE STRING EQUAL CHECKING https://stackoverflow.com/questions/8484668/java-does-not-equal-not-working
        // I LOVE STACK OVERFLOW
        Scanner scan = new Scanner(System.in);
        String input = "";
        while (!"-1".equals(input)) {
            System.out.println("Enter an item name or type '-1' to finish:");
            input = scan.nextLine();
            if (!"-1".equals(input)) {
                items += input + "\n";
            }
        }
              
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
