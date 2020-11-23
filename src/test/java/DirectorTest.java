import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void setUp(){
        director = new Director("John", "JB2345H", 30000.00, "Research", 50000.00);
    }

    @Test
    public void canGetBudget(){
        assertEquals(50000.00, director.getBudget(), 0.01);
    }

    @Test
    public void hasName(){
        assertEquals("John", director.getName());
    }
    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals("JB2345H", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Research", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(31000.00, director.raiseSalary(1000.00), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.00, director.payBonus(), 0.01);
    }
}
