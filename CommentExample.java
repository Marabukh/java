/**
 * @author Mark Bukharov
 * @version 1.0
 * @since 2024
 */
public class Calculator {

    /**
     * method for addition of two integer numbers.
     * 
     * @param a first number
     * @param b second number
     * @return sum of two numbers
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * method for subtraction of two integer numbers.
     * 
     * @param a first number
     * @param b second number
     * @return difference 
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * method for multiplication of two integer numbers.
     * 
     * @param a first number
     * @param b second number
     * @return product
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * method for division of integer numbers.
     * 
     * @param a first number
     * @param b second number
     * @return quotient 
     * @throws ArithmeticException if second number is zero
     */
    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
