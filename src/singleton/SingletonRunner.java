package singleton;

import singleton.src.SingletonEagerExample;
import singleton.src.SingletonExample;
import singleton.src.SingletonThreadSafeExample;
import singleton.src.SingletonThreadSafeOptimisedExample;

public class SingletonRunner {

    public static void main(String[] args) {
        // Basic singleton example

        /*
            SingletonExample singletonExample = new SingletonExample();
            Above will not work as the constructor is private in the SingletonExample class
            Only the same class can now initiate the object
         */

        SingletonExample instance1 = SingletonExample.getInstance();
        instance1.print("instance1");
        SingletonExample instance2 = SingletonExample.getInstance();
        instance2.print("instance2");
        // Note that only one object would be shared to both instance1 and instance2

        SingletonThreadSafeExample instance3 = SingletonThreadSafeExample.getInstance();
        instance3.print("instance3");

        SingletonEagerExample instance4 = SingletonEagerExample.getInstance();
        instance4.print("instance4");
        SingletonEagerExample instance5 = SingletonEagerExample.getInstance();
        instance5.print("instance5");

        SingletonThreadSafeOptimisedExample instance6 = SingletonThreadSafeOptimisedExample.getInstance();
        instance6.print("instance6");
        SingletonThreadSafeOptimisedExample instance7 = SingletonThreadSafeOptimisedExample.getInstance();
        instance7.print("instance7");
    }
}
