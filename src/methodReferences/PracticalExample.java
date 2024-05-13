package methodReferences;

import java.util.List;

public class PracticalExample {
    public static void main(String[] args) {

        // suppose we have a arraylist
        List<Integer> list=List.of(1,3,34,5,53,979,68);

        // if we want to print the items of list one by one then we can do -:

        // 1) list ko stream mai convert kro and uspr for each se print krdo using lambda
        list.stream().forEach(i-> System.out.println(i));

        // 2) System is a class jiske paas println function hai and hum forEach ko refer kr rhe hai sout() function se
        list.stream().forEach(System.out::println);
    }
}
