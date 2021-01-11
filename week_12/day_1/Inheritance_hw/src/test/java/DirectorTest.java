import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Alexander", "XX 00 00 00 X", 200000, "CEO", 90000);
    }

    @Test
    public void hasName(){
        assertEquals("Alexander", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("XX 00 00 00 X", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(200000, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(4800);
        assertEquals(204800, director.getSalary(), 0.01);
    }

    @Test
    public void hasPayBonus(){
        assertEquals(4000, director.payBonus(), 0.01);
    }


    @Test
    public void hasBudget() {
        assertEquals(90000, director.getBudget(), .01);
    }


}
