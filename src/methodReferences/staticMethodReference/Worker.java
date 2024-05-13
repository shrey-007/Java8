package methodReferences.staticMethodReference;

public interface Worker {
     void doTask();

}
class Main{
    public static void main(String[] args) {


        // To provide implementation of above interface we can

        // 1) Implement a class and override the doTask() method
        // 2) Create a anonymous class
        Worker worker=new Worker() {
            @Override
            public void doTask() {
                System.out.println("I am working through anonymous class");
            }
        };

        // 3) Use Lambda expression
        Worker worker1=()-> System.out.println("I am working through lambda expression");

        // 4) Use method references(Apan ne neeche ek method create kara hai MethodReferenceExample class mai and agar apan usi ko iski implementation banana chahte hai toh use method reference)
        // Also important thing is we are not calling doStuff function here, we are just refering ki ye implementation hai so we will not write doStuff() instead we will write doStuff
        Worker worker2= MethodReferenceExample::doStuff;

        worker.doTask();
        worker1.doTask();
        worker2.doTask();

    }
}

class MethodReferenceExample{
    // The method has to be static only coz hum jab ise MethodReferenceExample::doStuff() krke call krege toh tab doStuff() ko class name se refer kr rhe hai toh static hi krna padega
    public static void doStuff(){
        System.out.println("I am doing work through Method Reference ");
    }
}
