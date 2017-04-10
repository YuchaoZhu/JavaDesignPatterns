package FactoryDemos.AbstractFactory;

/**
 * Created by zhuyuchao on 2017/4/10.
 */
public class IntelFactory implements ComputerFactory {
    @Override
    public CPU makeCPU() {
        return new IntelCPU(735);
    }

    @Override
    public Mainboard makeMainboard() {
        return new IntelMainboard();
    }
}
