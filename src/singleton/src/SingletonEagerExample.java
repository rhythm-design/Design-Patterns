package singleton.src;

public class SingletonEagerExample {

    private static SingletonEagerExample oneInstance = new SingletonEagerExample();

    private SingletonEagerExample(){
        // We should only get this print statement 1 time
        // This confirms that only object of class is being shared at all places when required
        System.out.println("Object is initialized eagerly for class " + this.getClass().getSimpleName());
    }

    public static synchronized SingletonEagerExample getInstance(){
        return oneInstance;
    }

    public void print(String s){
        System.out.println(this.getClass().getSimpleName() + " -> " + s);
    }
}
