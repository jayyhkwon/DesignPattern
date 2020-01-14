package singleton.lazy;

public class LazySingleton1 {
    private static LazySingleton1 instance;

    private LazySingleton1(){}

    // non-synchronized
    // it makes a problem when multi-thread environment
    public static LazySingleton1 getInstance(){
        if(instance == null){
            instance = new LazySingleton1();
        }
        return instance;
    }
}
