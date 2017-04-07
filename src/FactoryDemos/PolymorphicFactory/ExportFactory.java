package FactoryDemos.PolymorphicFactory;

/**
 * Created by zhuyuchao on 2017/4/7.
 */
public interface ExportFactory {

    ExportFactory factory(String type);

}
