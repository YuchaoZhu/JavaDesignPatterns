package FactoryDemos.AbstractFactory;

/**
 * Created by zhuyuchao on 2017/4/10.
 */
public class IntelCPU implements CPU {

    public IntelCPU(int count){
    }

    @Override
    public boolean caculate() {
        return false;
    }
}
