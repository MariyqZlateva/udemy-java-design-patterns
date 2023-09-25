public class Singleton {
    // the private reference to the one and only instance
    private volatile static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton Constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     */
    private Singleton() {
    }

    // by adding the synchronized keyword to getInstance(),
    // we force every thread to wait its turn before it can enter the method
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class){ // we only synchronize the first time through
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // add a set data here
    public void setData(int myData) {
        data = myData;
    }

    public int getData(){
        return data;
    }
}
