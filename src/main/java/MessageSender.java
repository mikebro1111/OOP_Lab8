import facebook.FacebookUser;
import twitter.TwitterUser;

public class MessageSender {
    public boolean send(String text, Object user, String country){
        if (user instanceof FacebookUser){
            return true;
        }
        else if (user instanceof TwitterUser){
            return true;
        }
        return false;
    }
}
