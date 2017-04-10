package FactoryDemos.AbstractFactory;

/**
 * Created by zhuyuchao on 2017/4/10.
 */
public interface ComputerFactory {
    CPU makeCPU();
    Mainboard makeMainboard();

}
