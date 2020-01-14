package singleton.lazy;

public class HolderSingleton {

    private HolderSingleton(){}

    private static class Holder{
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance(){
        return Holder.INSTANCE;
    }

}
