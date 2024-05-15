package singleton.src;

public class SingletonThreadSafeExample {

    private static SingletonThreadSafeExample oneInstance;

    private SingletonThreadSafeExample(){
        // We should only get this print statement 1 time
        // This confirms that only object of class is being shared at all places when required
        System.out.println("Object is created for class " + this.getClass().getSimpleName());
    }

    public static synchronized SingletonThreadSafeExample getInstance(){
        // in this every time each thread is synchronised, this would make it slower
        if(oneInstance == null){
            oneInstance = new SingletonThreadSafeExample();
        }
        return oneInstance;
    }

    public void print(String s){
        System.out.println(this.getClass().getSimpleName() + " -> " + s);
    }
}
