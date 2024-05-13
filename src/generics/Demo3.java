package generics;

public class Demo3<T> {

    T container;

    public Demo3(T container) {
        this.container = container;
    }

    public void doOperation(){
        if(container instanceof String){
            System.out.println("It is a string");
        }
        else if(container instanceof Integer){
            System.out.println("It is a integer");
        }
        else{
            System.out.println("It is a something else");
        }

    }

    public static void main(String[] args) {

        Demo3<Integer> demo=new Demo3(54);
        demo.doOperation();
    }
}
