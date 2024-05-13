package lambdaExpression;

public interface MyInterface {
     void sayHello();
}

class Main3{
    public static void main(String[] args) {

        MyInterface myInterface=()->{
            System.out.println("hello");
        };

        MyInterface myInterface2=()->{
            System.out.println("hi");
        };

        // There are two different objects and dono ne apne according implement kra hai sayHello() function ko
        myInterface.sayHello();
        myInterface2.sayHello();
    }

}



