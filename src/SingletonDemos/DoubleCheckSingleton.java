package SingletonDemos;

/**
 * Created by zhuyuchao on 2017/4/7.
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        if(instance==null){
            synchronized (DoubleCheckSingleton.class){
                if(instance==null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
