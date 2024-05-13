package lambdaExpression;

public interface Calculator {
    // It should only have one method, not more than that
    int sum(int x, int y);
}

class Main {
    public static void main(String[] args) {
        // This is implementation of above abstract method
        Calculator calculator = (x,y) -> x + y;

        // Now, you can use the calculator object which has implemented the sum function
        int result = calculator.sum(3, 4);
        System.out.println("Sum: " + result);
    }
}
