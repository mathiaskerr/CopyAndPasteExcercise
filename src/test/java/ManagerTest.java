import managment.Manager;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mork", 6969,420.00,"Tech");
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(30.00);
        assertEquals(450.00,manager.getSalary(),0.0);
    }
    @Test
    public void canRaiseSalaryAgain(){
        manager.raiseSalary(-30.00);
        assertEquals(420.00,manager.getSalary(),0.0);
    }
    @Test
    public void canCalcBonus(){
        assertEquals(4.20,manager.payBonus(),0.00);
    }
    @Test
    public void canGetName(){
        assertEquals("Mork", manager.getName());
    }
    @Test
    public void canChangeName(){
        manager.setName("");
        assertEquals("Mork", manager.getName());
    }
    @Test
    public void canGetNiNumber(){
        assertEquals(6969, manager.getNiNumber(),0.00);
    }
    @Test
    public void canChangeNiNumber(){
        manager.setName("G8");
        assertEquals("G8", manager.getName());
    }
    @Test
    public void canGetDept(){
        assertEquals("Tech", manager.getDeptName());
    }
    @Test
    public void canChangeDept(){
        manager.setDeptName("G8");
        assertEquals("G8", manager.getDeptName());
    }
}
