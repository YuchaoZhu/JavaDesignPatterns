package SingletonDemos;

/**
 * Created by zhuyuchao on 2017/4/7.
 * 双重检查实现单例
 * volatile屏蔽JVM代码优化，效率不高一般不用
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
