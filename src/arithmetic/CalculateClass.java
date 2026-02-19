/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmetic;

/**
 *
 * @author John Lagumbay
 */
public class CalculateClass {

    /**
     * Creates one ArithmeticBase object per Operation enum constant.
     * Uses Operation.values().length — no hardcoded numbers.
     * Mirrors: int numberValues = Card.Value.values().length;
     *
     * @param x first operand
     * @param y second operand
     * @return  array of ArithmeticBase, one entry per operation
     */
    public static ArithmeticBase[] generateResults(double x, double y) {

        // How many operations are defined in the enum?
        int numOperations = ArithmeticBase.Operation.values().length; // 4 constants
        ArithmeticBase[] results = new ArithmeticBase[numOperations];

        // Loop through every enum constant
        for (int i = 0; i < numOperations; i++) {
            ArithmeticBase.Operation op = ArithmeticBase.Operation.values()[i];
            results[i] = new ArithmeticBase(x, y, op);
        }

        return results;
    }

    /**
     * Performs the calculation for the given ArithmeticBase object.
     * Switch operates on the enum constant — type safe, compiler enforced.
     *
     * @param a ArithmeticBase object containing x, y, and operation
     * @return  the computed result as a double
     */
    public static double calculate(ArithmeticBase a) {
        switch (a.getOp()) {
            case PLUS:
                return a.getX() + a.getY();
            case MINUS:
                return a.getX() - a.getY();
            case TIMES:
                return a.getX() * a.getY();
            case DIVIDE:
                if (a.getY() == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a.getX() / a.getY();
            default:
                throw new AssertionError("Unknown operation: " + a.getOp());
        }
    }
}
