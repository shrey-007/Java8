package lambdaExpression;// A Java program to demonstrate simple lambda expressions
import java.util.ArrayList;
class Test {
    public static void main(String args[])
    {
        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Using lambda expression to print all elements
        // of arrL
        arrL.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements
        // of arrL
        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
        /*
        The forEach method is a default method added to the Iterable interface in Java 8, which accepts a functional
        interface as an argument. It takes a Consumer functional interface as a parameter, which has one abstract method
        accept(). The lambda expression n -> System.out.println(n) acts as an implementation of this Consumer interface,
        where n is the parameter passed to the accept() method, and System.out.println(n) is the action performed on
        each element of the collection.
        So, while lambda expressions are commonly used with functional interfaces, they can also be used in other
        contexts, like with methods that accept functional interfaces as parameters, such as the forEach method in
        this case.
        */
    }
}
