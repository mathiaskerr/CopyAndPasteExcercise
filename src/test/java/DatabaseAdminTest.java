import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Mork", 6969,420.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Mork", databaseAdmin.getName());
    }
    @Test
    public void canChangeName(){
        databaseAdmin.setName("G8");
        assertEquals("G8", databaseAdmin.getName());
    }
    @Test
    public void canGetNiNumber(){
        assertEquals(6969, databaseAdmin.getNiNumber(),0.00);
    }
    @Test
    public void canChangeNiNumber(){
        databaseAdmin.setName("G8");
        assertEquals("G8", databaseAdmin.getName());
    }
}
