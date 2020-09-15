import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void test_01 (){
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    public void test_02 (){
        assertEquals(720, Factorial.factorial(6));
    }

    @Test
    public void test_03 (){
        assertEquals(3628800, Factorial.factorial(10));
    }

    @Test
    public void test_04 (){
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void test_05 (){
        try {
            assertEquals("Number not valid. It should be 0 or positive.", Factorial.factorial(-3));
            Assert.fail( "Should have thrown an exception" );
        } catch (Exception e) {
            String expectedMessage = "Number not valid. It should be 0 or positive.";
            Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
        }
    }

    @Test
    public void test_06 (){
        try {
            assertEquals("Number not valid. It should be 0 or positive.", Factorial.factorial(14));
            Assert.fail( "Should have thrown an exception" );
        } catch (Exception e) {
            String expectedMessage = "Number not valid. It should be 0 or positive.";
            Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
        }
    }



}
