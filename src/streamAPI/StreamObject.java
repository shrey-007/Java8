package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        // Stream is an interface, so we can not directly get its object
        // So below are the ways to get object of Stream API
//==========================================================================================================================================
        // 1- to create an empty stream of objects
        Stream<Object> empty=Stream.empty();
        // since it is empty stream so it will not print anything
        empty.forEach(i-> System.out.println(i));

//==========================================================================================================================================
        // 2 method
        String names[]={"Durgesh","Uttam","Ankit","Divya"};
        Stream<String> stream=Stream.of(names);
//==========================================================================================================================================
        // 3 method(use builder pattern)
        Stream<Object> objectStream = Stream.builder().build();
//==========================================================================================================================================
        // 4
        Stream stream1=(Stream) Arrays.stream(new int[]{3,4,2,3});
//==========================================================================================================================================
        // 5(directly call stream function on collections framework objects) It is most important
        ArrayList arrayList=new ArrayList<>();
        Stream<Integer> stream2=arrayList.stream();
    }


}
