package users;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyFacebookUserTest {

    FacebookUser user1;
    MyFacebookUser Obj;

    @BeforeEach
    void setUp() {
        user1 = new FacebookUser("email", "country", new Date());
        Obj = new MyFacebookUser(user1);
    }

    @Test
    void checkAttributes() {
        assertEquals(user1.getEmail(), Obj.getEmail());
        assertEquals("country", Obj.getCountry());
    }


}
