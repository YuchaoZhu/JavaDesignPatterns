package Builder.BuilderDemo02;

/**
 * Created by zhuyuchao on 17/4/10.
 */
public class GoodbyeBuilder implements MessageBuilder {

    private GoodbyeMessage message;

    @Override
    public void buildTo(String to) {
        message.setTo(to);
    }

    @Override
    public void buildFrom(String from) {
        message.setFrom(from);
    }

    @Override
    public void buildSubject(String subject) {
        message.setSubject(subject);
    }

    @Override
    public void buildBody(String body) {
        message.setBody(body);
    }

    @Override
    public void buildSendDate(String date) {
        message.setSendDate(date);
    }

    @Override
    public void sendMessage() {

    }

    public AutoMessage retriveMessage(){
        return message;
    }
}
