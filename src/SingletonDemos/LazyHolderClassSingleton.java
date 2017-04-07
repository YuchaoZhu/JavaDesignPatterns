package SingletonDemos;

/**
 * Created by zhuyuchao on 2017/4/7.
 * 利用类型内部类只有在第一次使用时才会加载特性
 * 同时节约了时间和空间
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
