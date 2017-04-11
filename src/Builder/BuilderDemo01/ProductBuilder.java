package Builder.BuilderDemo01;

/**
 * Created by zhuyuchao on 17/4/10.
 */
public class ProductBuilder implements Builder{

    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("1234");
    }

    @Override
    public void buildPart2() {
        product.setPart2("4321");
    }

    @Override
    public Product retriveProduct() {
        return product;
    }
}
