package authorization;

import db.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthorizationTest {
    Authorization a;
    Database db;

    @BeforeEach
    void setUp() {
        db = new Database();
        a = new Authorization();
    }

    @Test
    void authorization() {
        assertTrue(a.authorize(db));
    }
}
