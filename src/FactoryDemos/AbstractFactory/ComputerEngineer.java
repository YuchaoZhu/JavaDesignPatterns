package FactoryDemos.AbstractFactory;

/**
 * Created by zhuyuchao on 2017/4/10.
 */
public class ComputerEngineer {

    public static void main(String[] args){
        ComputerFactory factory = new IntelFactory();
        CPU cpu = factory.makeCPU();
        Mainboard mainboard = factory.makeMainboard();
        System.out.println(mainboard.testCPU(cpu));
    }
}
