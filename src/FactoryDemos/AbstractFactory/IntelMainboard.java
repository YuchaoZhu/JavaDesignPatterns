package FactoryDemos.AbstractFactory;

/**
 * Created by zhuyuchao on 2017/4/10.
 */
public class IntelMainboard implements Mainboard {

    @Override
    public boolean testCPU(CPU cpu) {
        if (cpu instanceof IntelCPU){
            return true;
        }else {
            return false;
        }
    }
}
