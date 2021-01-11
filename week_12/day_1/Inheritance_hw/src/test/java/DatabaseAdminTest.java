import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Rob", "TY 65 84 32 O", 40000);
    }

    @Test
    public void hasName(){
        assertEquals("Rob", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("TY 65 84 32 O", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1200);
        assertEquals(41200, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void hasPayBonus(){
        assertEquals(400, databaseAdmin.payBonus(), 0.01);
    }
}
