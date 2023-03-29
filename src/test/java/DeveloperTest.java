import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mork", 6969,420.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Mork", developer.getName());
    }
    @Test
    public void canChangeName(){
        developer.setName("G8");
        assertEquals("G8", developer.getName());
    }
    @Test
    public void canGetNiNumber(){
        assertEquals(6969, developer.getNiNumber(),0.00);
    }
    @Test
    public void canChangeNiNumber(){
        developer.setName("G8");
        assertEquals("G8", developer.getName());
    }

}
