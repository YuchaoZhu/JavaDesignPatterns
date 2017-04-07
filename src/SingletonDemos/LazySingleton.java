package SingletonDemos;

/**
 * Created by zhuyuchao on 2017/4/7.
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){};

    public static synchronized LazySingleton getInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }


}
