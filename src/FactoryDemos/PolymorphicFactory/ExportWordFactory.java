package FactoryDemos.PolymorphicFactory;

/**
 * Created by zhuyuchao on 2017/4/7.
 */
public class ExportWordFactory implements ExportFactory{
    @Override
    public ExportFile factory(String type) {
        if("standard".equals(type)){
            return new ExportStandardWordFile();
        }else if("fanicial".equals(type)){
            return new ExportFanicialWordFile();
        }else{
            throw new RuntimeException("No file Type available");
        }
    }
}
