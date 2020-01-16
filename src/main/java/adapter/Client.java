package adapter;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Target target = () -> {
            System.out.println("this is target");
        };
        testTarget(target);

        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);

        testTarget(adapter);
        Arrays.asList();
    }

    private static void testTarget(Target target){
        target.perform();
    }


}
