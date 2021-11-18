package build;

import db.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportBuilderTest {

    Database database;

    @BeforeEach
    void setUp() {
        database = new Database();
    }

    @Test
    void getUserData() {
        assertEquals("Привіт", database.getUserData());
    }

    @Test
    void getStatisticalData() {
        assertEquals("Добрий день", database.getStatisticalData());
    }


}
