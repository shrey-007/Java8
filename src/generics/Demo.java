package generics;

import java.util.List;

public class Demo {

    // If we write this , then it means ki ye container sirf String ka object store kr skta hai.
    String container;

    // so we can do something like this, this can store any object. Because Object class is top most parent class of all java classes
    // But this object class will not provide type safety cox dekho main method se int, string , kuch bhi paas kr rhe hai constructor mai
    Object contanier2;

    // Generic will solve both problems
    // Example is shown in Demo2

    public Demo(Object contanier2) {
        this.contanier2 = contanier2;
    }

    public static void main(String[] args) {
        Demo demo=new Demo(2);
        Demo demo1= new Demo("shrey");
    }

}
