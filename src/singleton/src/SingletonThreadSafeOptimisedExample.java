package singleton.src;

public class SingletonThreadSafeOptimisedExample {

    private volatile static SingletonThreadSafeOptimisedExample oneInstance;

    private SingletonThreadSafeOptimisedExample(){
        // We should only get this print statement 1 time
        // This confirms that only object of class is being shared at all places when required
        System.out.println("Object is created for class " + this.getClass().getSimpleName());
    }

    public static SingletonThreadSafeOptimisedExample getInstance(){
        // Here for the only first object creation call is synchronised
        // after it it will go like regular method
        if(oneInstance == null){
            synchronized (SingletonThreadSafeOptimisedExample.class){
                if(oneInstance == null){
                    oneInstance = new SingletonThreadSafeOptimisedExample();
                }
            }
        }
        return oneInstance;
    }

    public void print(String s){
        System.out.println(this.getClass().getSimpleName() + " -> " + s);
    }
}
