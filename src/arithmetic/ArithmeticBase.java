package arithmetic;

/**
 * @author John Lagumbay
 */
public class ArithmeticBase {

    // enum — constants, special class, user defined data type
    public enum Operation { PLUS, MINUS, TIMES, DIVIDE }

    private double x;         // first operand
    private double y;         // second operand
    private Operation op;     // store enum constant — user defined type

    public ArithmeticBase(double x, double y, Operation op) {
        this.x = x;
        this.y = y;
        this.op = op;
    }

    // --- Getters ---

    /**
     * @return the first operand x
     */
    public double getX() {
        return x;
    }

    /**
     * @return the second operand y
     */
    public double getY() {
        return y;
    }

    /**
     * @return the Operation enum constant
     */
    public Operation getOp() {
        return op;
    }

    // --- Setters ---

    /**
     * @param x the first operand to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @param y the second operand to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @param op the Operation enum constant to set
     */
    public void setOp(Operation op) {
        this.op = op;
    }
}
