import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Before
    public void setUp(){
        employee = new Employee("Michael", "PX 26 72 06 D", 100000);
        }

    @Test
    public void hasName(){
        assertEquals("Michael", employee.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("PX 26 72 06 D", employee.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(3000);
        assertEquals(103000, employee.getSalary(), 0.01);
    }

    @Test
    public void hasPayBonus(){
        assertEquals(1000, employee.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        employee.setName("Louise");
        assertEquals("Louise", employee.getName());
    }

    @Test
    public void nameMustNotBeNull(){
        employee.setName(null);
        assertEquals("Michael", employee.getName());
    }

    @Test
    public void payBonusMoreThanZero(){
        employee.raiseSalary(-100);
        assertEquals(100000, employee.getSalary(), 0.01);
    }
}

