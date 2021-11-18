package users;

import facebook.FacebookUser;

import java.util.Date;

public class MyFacebookUser implements User{

    private FacebookUser Obj;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.Obj = facebookUser;
    }

    public String getEmail(){
        return Obj.getEmail();
    }

    public String getCountry(){
        return Obj.getUserCountry();
    }

    public Date getDate() {
        return Obj.getUserActiveTime();
    }
}
