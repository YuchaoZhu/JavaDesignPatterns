package FactoryDemos.StaticFactoryMethod;

/**
 * Created by zhuyuchao on 2017/4/7.
 */
public class LoginManager {

    public static Login Factory(String type){
        if("password".equals(type)){
            return new PasswordLogin();
        }else if("domain".equals(type)){
            return new DomanLogin();
        }else{
            throw new RuntimeException("No available login type");
        }
    }

}
