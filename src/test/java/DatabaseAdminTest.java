import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    public DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Steven", "JB648374A", 21000.00);
        }
    @Test
    public void canGetName(){
        assertEquals("Steven", databaseAdmin.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals("JB648374A", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(21000.00, databaseAdmin.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary(){
        assertEquals(22000.00, databaseAdmin.raiseSalary(1000.00), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(210.00, databaseAdmin.payBonus(), 0.01);
    }
    }


