package FactoryDemos.AbstractFactory;

/**
 * Created by zhuyuchao on 2017/4/10.
 */
public class AmdFactory implements ComputerFactory {
    @Override
    public CPU makeCPU() {
        return new AmdCPU(800);
    }

    @Override
    public Mainboard makeMainboard() {
        return new AmdMainboard();
    }
}
