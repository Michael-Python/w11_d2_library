import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest{

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Brano", "SC 76 42 09 O", 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Brano", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("SC 76 42 09 O", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(900);
        assertEquals(30900, developer.getSalary(), 0.01);
    }

    @Test
    public void hasPayBonus(){
        assertEquals(300, developer.payBonus(), 0.01);
    }
}
