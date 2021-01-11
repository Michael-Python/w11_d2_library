import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Finlay", "PX 56 54 86 P", 85000, "Production");
    }

    @Test
    public void hasName(){
        assertEquals("Finlay", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("PX 56 54 86 P", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(85000, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2550);
        assertEquals(87550, manager.getSalary(), 0.01);
    }

    @Test
    public void hasPayBonus(){
        assertEquals(850, manager.payBonus(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Production", manager.getDeptName());
    }
}
