package FactoryDemos.PolymorphicFactory;

/**
 * Created by zhuyuchao on 17/4/8.
 */
public class ExportHTMLFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if("standard".equals(type)){
            return new ExportStandardHTMLFile();
        }else if("fanicial".equals(type)){
            return new ExportFanicialHTMLFile();
        }else{
            throw new RuntimeException("No file Type available");
        }
    }
}
