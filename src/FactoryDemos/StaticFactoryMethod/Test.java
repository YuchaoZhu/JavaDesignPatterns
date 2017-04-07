package FactoryDemos.StaticFactoryMethod;

/**
 * Created by zhuyuchao on 2017/4/7.
 */
public class Test {

    public static void main(String[] args){
        String type = "password";
        Login login = LoginManager.Factory(type);
        System.out.println(login.login("username","password"));
    }

}
