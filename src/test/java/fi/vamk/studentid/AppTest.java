package fi.vamk.studentid;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    //Test (another test case)to check add function will work or not
    @Test
    public void AddTest(){
        assertEquals(10,App.add(4,6));
        assertEquals(0, App.add(0, 0));
        assertEquals(0, App.add(-6, 6));

    }
    @Test
    public void testDivideMethod(){
        assertEquals("1,33", App.divide(4, 3));
        assertEquals( "0", App.divide(0, 1));
        assertEquals("NaN", App.divide(1, 0));
    }
    @Test
    public void testTwoLetter(){
        assertEquals("qw", App.twoLetter("qwerty"));
        assertEquals("VA", App.twoLetter("VA"));
        assertEquals("V",App.twoLetter("V"));
        assertEquals("",App.twoLetter(""));
        assertNull(App.twoLetter(null));
    }
    @Test
    public void testDivideDoubleMethod(){

        assertEquals((Double) 1.33, App.divideDouble(4d, 3d));
        assertEquals((Double) 33.0, App.divideDouble(99d, 3d));
        assertEquals((Double) null, App.divideDouble(null, 3d));
        assertEquals((Double) null, App.divideDouble(3d, null));
        assertEquals((Double) null, App.divideDouble(3d, 0d));

    }

}
