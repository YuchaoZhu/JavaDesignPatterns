package FactoryDemos.PolymorphicFactory;

/**
 * Created by zhuyuchao on 17/4/8.
 */
public class Test {

    public static void main(String[] args){
        ExportFactory factory = new ExportWordFactory();
        ExportFile exportFile = factory.factory("standard");
        System.out.println(exportFile.export());
    }
}
