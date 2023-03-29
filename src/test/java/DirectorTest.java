import managment.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Mork", 6969,420.00,"Tech", 50.00);
    }
    @Test
    public void canRaiseSalary(){
        director.raiseSalary(30.00);
        assertEquals(450.00,director.getSalary(),0.0);
    }
    @Test
    public void canCalcBonus(){
        assertEquals(4.20,director.payBonus(),0.00);
    }
    @Test
    public void canGetName(){
        assertEquals("Mork", director.getName());
    }
    @Test
    public void canChangeName(){
        director.setName("G8");
        assertEquals("G8", director.getName());
    }
    @Test
    public void canGetNiNumber(){
        assertEquals(6969, director.getNiNumber(),0.00);
    }
    @Test
    public void canChangeNiNumber(){
        director.setName("G8");
        assertEquals("G8", director.getName());
    }
    @Test
    public void canGetDept(){
        assertEquals("Tech", director.getDeptName());
    }
    @Test
    public void canChangeDept(){
        director.setDeptName("G8");
        assertEquals("G8", director.getDeptName());
    }
    @Test
    public void canChangeBudget(){
        director.setBudget(60.00);
        assertEquals(60.00, director.getBudget(),0.00);
    }
    @Test
    public void canGetBudget(){
        assertEquals(50.00, director.getBudget(),0.00);
    }
    @Test
    public void canGetBonus(){

        assertEquals(8.4, director.payBonus(),0.00);
    }
}
