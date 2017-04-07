package SingletonDemos;

/**
 * Created by zhuyuchao on 2017/4/7.
 */
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){};

    public static EagerSingleton getInstance(){
        return instance;
    }

}
