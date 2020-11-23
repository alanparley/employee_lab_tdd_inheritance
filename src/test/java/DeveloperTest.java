import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    public Developer developer;

    @Before
    public void before() {
        developer = new Developer("Sarah", "AB23454", 20000.00);
    }
    @Test
    public void canGetName(){
        assertEquals("Sarah", developer.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals("AB23454", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000.00, developer.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary(){
        assertEquals(21000.00, developer.raiseSalary(1000.00), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200.00, developer.payBonus(), 0.01);
    }
}
