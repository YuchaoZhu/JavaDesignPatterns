package SingletonDemos;

/**
 * Created by zhuyuchao on 2017/4/7.
 */
public class LazyHolderClassSingleton {

    private LazyHolderClassSingleton(){}

    private static class SingletonHolder{
        private static LazyHolderClassSingleton instance = new LazyHolderClassSingleton();
    }

    public static LazyHolderClassSingleton getInstance(){
        return SingletonHolder.instance;
    }

}
