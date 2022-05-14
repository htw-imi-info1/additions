
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AddressTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AddressTest
{
    /**
     * Default constructor for test class AddressTest
     */
    public AddressTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testEquality1()
    {
        Address address1 = new Address("Wilhelminenhofstrasse", "Berlin");
        Address address2 = new Address("Köpenickerstr.", "Berlin");
        assertEquals(false, address1.equals(address2));
    }

    @Test
    public void testEquality2()
    {
        Address address1 = new Address("Wilhelminenhofstrasse", "Berlin");
        Address address2 = new Address("Wilhelminenhofstrasse", "Berlin");
        assertEquals(true, address1.equals(address2));
    }

    @Test
    public void testEquality3()
    {
        Address address1 = new Address("Wilhelminenhofstrasse", "Berlin");
        Address address2 = address1;
        assertEquals(true, address1.equals(address2));
    }
    
    @Test
    public void testEquality4()
    {
        Address address1 = new Address("Wilhelminenhofstrasse", "Berlin");
        Address address2 = new Address("Wilhelminenhofstrasse", "Brandenburg");
        assertEquals(false, address1.equals(address2));
    }
}

