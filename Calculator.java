public class Calculator {
    private int number1;
    private int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int addNumbers() {
        return number1 + number2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 3);
        int result = calculator.addNumbers();
        System.out.println("The sum is: " + result);
    }
}



