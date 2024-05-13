package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {

        // Question = Create a list and filter all even numbers from list

        // If we do it manually
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(50);
        arrayList.add(21);
        arrayList.add(22);
        arrayList.add(67);

        System.out.println(arrayList);

        ArrayList evenList=new ArrayList<>();

        for(int i:arrayList){
            if(i%2==0){
                evenList.add(i);
            }
        }

        System.out.println(evenList);


        // If we use StreamAPI


        // First fetch the stream of integers from arrayList
        Stream<Integer> stream = arrayList.stream();
        // Now we can perform bulk operation on this stream.This filter function is used to filter the stream.It takes
        // a predicate function(A boolean function) as a input which if returns true toh use filter krega else if false then it don't filters
        // Predicate is a functional interface so we can use lambda expressions.
        // After filtering out , we have to collect the filtered stream in a new list
        List<Integer> newList = stream.filter((i)->i%2==0).collect(Collectors.toList());

        // we can do this in single line also
        List<Integer> newList2 = arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
    }
}
