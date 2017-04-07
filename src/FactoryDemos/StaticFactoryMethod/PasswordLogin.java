package FactoryDemos.StaticFactoryMethod;

/**
 * Created by zhuyuchao on 2017/4/7.
 */
public class PasswordLogin implements Login{
    @Override
    public boolean login(String username, String password) {
        return true;
    }
}
