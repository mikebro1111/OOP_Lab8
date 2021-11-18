package users;

import lombok.Setter;
import twitter.TwitterUser;

import java.util.Date;

@Setter
public class MyTwitterUser implements User{
    private TwitterUser Obj;


    public MyTwitterUser(TwitterUser twitterUser) {
        this.Obj = twitterUser;
    }

    public String getCountry(){
        return Obj.getCountry();
    }

    public String getEmail(){
        return Obj.getUserMail();
    }

    public Date getDate() {
        return Obj.getLastActiveTime();
    }
}
