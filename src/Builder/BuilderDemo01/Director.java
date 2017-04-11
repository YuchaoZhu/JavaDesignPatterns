package Builder.BuilderDemo01;

/**
 * Created by zhuyuchao on 17/4/10.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
