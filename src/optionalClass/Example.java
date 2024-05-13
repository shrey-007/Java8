package optionalClass;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Example {
    public static void main(String[] args) {

        String str="shrey";

        // without usinig optional
        if (str==null){
            System.out.println("This is null object");
        }
        else {
            System.out.println(str.length());
        }

        System.out.println("--------------------------------------------------------------------------------------------------------");
        // with optional
        Optional<String> stringOptional=Optional.ofNullable(str);
        // to find whether us box mai koi value hai ki nhi
        System.out.println(stringOptional.isPresent());
        // to get the value, if value is not present then it will throw exception
        System.out.println(stringOptional.get());
        // agar value present hogi toh vahi print krega , else it prints the provided string
        System.out.println(stringOptional.orElse("It is null"));



    }

}
