public class Calculator {
    public static void main(String[] args) {

        Context context = new Context();
        double result = context.executeCalculate(new Addition(), 10, 5);
        System.out.println("10 + 5 = " + result);

        result = context.executeCalculate(new Subtraction(), 10, 5);
        System.out.println("10 - 5 = " + result);

        result = context.executeCalculate(new Multiplication(), 10, 5);
        System.out.println("10 * 5 = " + result);

    }
}
