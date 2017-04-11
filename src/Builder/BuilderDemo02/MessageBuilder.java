package Builder.BuilderDemo02;

/**
 * Created by zhuyuchao on 17/4/10.
 */
public interface MessageBuilder {

    AutoMessage message = null;

    void buildTo(String to);
    void buildFrom(String from);
    void buildSubject(String subject);
    void buildBody(String body);
    void buildSendDate(String date);

    void sendMessage();
}