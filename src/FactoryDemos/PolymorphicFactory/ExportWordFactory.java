package FactoryDemos.PolymorphicFactory;

/**
 * Created by zhuyuchao on 2017/4/7.
 */
public class ExportWordFactory implements ExportFactory{
    @Override
    public ExportFactory factory(String type) {
        if("simple".equals(type)){
            return null;
        }
        return null;
    }
}
