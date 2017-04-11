package Builder.BuilderDemo02;

/**
 * Created by zhuyuchao on 17/4/11.
 */
public class MessageDirector {
    MessageBuilder messageBuilder = null;

    public MessageDirector(MessageBuilder messageBuilder){
        this.messageBuilder = messageBuilder;
    }

    public void construct(String to, String from){
        messageBuilder.buildTo(to);
        messageBuilder.buildFrom(from);
        messageBuilder.buildBody("dfsa");
        messageBuilder.buildSubject("fds");
        messageBuilder.sendMessage();
    }

}
