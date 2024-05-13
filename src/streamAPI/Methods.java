package streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        // filter, stream ke har object pr iterate krega and check krega ki vo particular object predicate function ko true return kr rha hai ya false. If true then it filters the object else it doen not.

        // map is used to iterate all objects and perform some task like squaring all integer and returning the object

        List<String> names= List.of("Aman","Ankit","Abhinav","Durgesh");

        // now if we want to filter out names which start from A then we will use filter
        List<String> namesStartingWithA = names.stream().filter(s->s.charAt(0)=='A' || s.charAt(0)=='a').collect(Collectors.toList());
        System.out.println(namesStartingWithA);

        // If we want to append Saxena to each name then we will use map
        List<String> nameWithSurname = names.stream().map(s->s+" Saxena").collect(Collectors.toList());
        System.out.println(nameWithSurname);

        // collecct is used to collect the final stream into set, list, map etc

        // to sort the stream
        names.stream().sorted();

        // to find the minimum pass comparator using lambda, and it will return single element toh get se lelo instread of collect
        String min=names.stream().min((x,y)->x.compareTo(y)).get();




    }
}
