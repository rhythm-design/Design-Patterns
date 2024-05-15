package singleton.src;

public class SingletonExample {

    private static SingletonExample oneInstance;

    private SingletonExample(){
        // We should only get this print statement 1 time
        // This confirms that only object of class is being shared at all places when required
        System.out.println("Object is created for class " + this.getClass().getSimpleName());
    }

    public static SingletonExample getInstance(){
        if(oneInstance == null){
            oneInstance = new SingletonExample();
        }
        return oneInstance;
    }

    public void print(String s){
        System.out.println(this.getClass().getSimpleName() + " -> " + s);
    }
}
