import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("James", "JG825473B", 24000.00, "Research");
    }

    @Test
    public void hasName(){
        assertEquals("James", manager.getName());
    }
    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals("JG825473B", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(24000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Research", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(25000.00, manager.raiseSalary(1000.00), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(240.00, manager.payBonus(), 0.01);
    }






}
