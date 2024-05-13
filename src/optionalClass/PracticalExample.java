package optionalClass;

import java.util.Optional;

public class PracticalExample {
    public static Optional<String> getUser(){
        String user="null";

        // logic to run a database query to get the user, and apan ko pta nhi hai ki user
        //  database mai exists krta hai ki nhi toh us case mai user null hi rahega

        return Optional.ofNullable(user);
    }

    public static void main(String[] args) {
        Optional<String> optional=getUser();
    }
}
