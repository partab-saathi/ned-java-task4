
/* Q4: Write a Java program that defines the number of coffee cups sold and the price per cup.
There are two types of coffee: special and simple.
The program should calculate and display the total bill for the coffee. */
public class Q4 {

    public static void main(String[] args) {
        int SpecialCoffeeCups = 3;
        int SimpleCoffeeCups = 5;

        double PricePerSpecialCup = 150.0;
        double PricePerSimpleCup = 100.0;

        double TotalSpecialBill = SpecialCoffeeCups * PricePerSpecialCup;
        double TotalSimpleBill = SimpleCoffeeCups * PricePerSimpleCup;
        double TotalBill = TotalSpecialBill + TotalSimpleBill;

        System.out.println("Total Bill for Coffee = Rs. " + TotalBill + " PKR");
        System.out.println("Coded By: Partab Saathi");
    }
}
