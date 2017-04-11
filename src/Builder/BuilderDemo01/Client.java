package Builder.BuilderDemo01;

/**
 * Created by zhuyuchao on 17/4/10.
 */
public class Client {

    public static void main(String[] args){
        Builder builder = new ProductBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retriveProduct();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
