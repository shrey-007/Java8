package generics;

public class Demo2 <T> {

    // Ab dekho agar
    T container;

    Demo2(T container){
        this.container=container;
    }

    public static void main(String[] args) {

        // so it is giving type safety if we try to insert String in <Integer> , it will give error
        Demo2<Integer> demo=new Demo2<>(98);

        // It is also giving choice , esa nhi hai ki sirf integer ka object store kr paaoge, string ka bhi kr skte hai
        Demo2<String> demo2=new Demo2<>("shrey");

        // for example jab hum arraylist banate hai toh apan kisi ki bhi list bana skte hai integer,string,float etc so it is providing choices
        // also agar ek baar bata diya ki arraylist integer ki banani hai toh fir usme sirf integer hi daal skte hai, so it os giving type safety also
    }

}
