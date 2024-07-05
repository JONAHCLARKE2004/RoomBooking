
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LabRoomTest {
    
    public LabRoomTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumOfPCs method, of class LabRoom.
     */
    @Test
    public void testGetNumOfPCs() {
        LabRoom instance = new LabRoom("10", 101, 1, 1, "Windows"); 
        int expResult = 0; 
        int result = instance.getNumOfPCs();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetOperatingSystem() {
        LabRoom instance = new LabRoom("10", 101, 1, 1, "Windows");
        String expResult = "Windows"; 
        String result = instance.getOperatingSystem();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNumOfPCs() {
        int numOfPCs = 5;
        LabRoom instance = new LabRoom("10", 101, 1, 1, "Windows");
        instance.setNumOfPCs(numOfPCs);
        assertEquals(numOfPCs, instance.getNumOfPCs());
    }

    @Test
    public void testSetOperatingSystem() {
        String operatingSystem = "Windows";
        LabRoom instance = new LabRoom("10", 101, 1, 1, operatingSystem); 
        instance.setOperatingSystem(operatingSystem);
        assertEquals(operatingSystem, instance.getOperatingSystem());
    }
}
