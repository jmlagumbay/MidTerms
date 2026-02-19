/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic {

    public static void main(String[] args) {

        // --- User input — collected once, here only ---
        Scanner in = new Scanner(System.in);


        System.out.print("Enter first number  (x): ");
        double x = in.nextDouble();

        System.out.print("Enter second number (y): ");
        double y = in.nextDouble();

        in.close();

        // --- Delegate to CalculateClass — loose coupling ---
        // Mirrors: Card[] hand = GenerateClass.generateHand(10);
        ArithmeticBase[] results = CalculateClass.generateResults(x, y);

        // --- Print all results ---
        // Mirrors: for(Card c: hand) { System.out.println(c.getSuit() + " " + c.getValue()); }
        System.out.println("\n--- Results for x=" + x + "  y=" + y + " ---");

        for (ArithmeticBase a : results) {
            try {
                double result = CalculateClass.calculate(a);
                System.out.println(a.getOp() + " : " + result);
            } catch (ArithmeticException e) {
                System.out.println(a.getOp() + " : " + e.getMessage());
            }
        }
    }
}

