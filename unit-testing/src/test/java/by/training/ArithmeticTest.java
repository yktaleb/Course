package by.training;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class ArithmeticTest {

    private Arithmetic arithmetic;
    private static Integer count = 1;

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    /*
    * Time limit for all test method
    * */
    @Rule
    public final Timeout timeoutOneSecond = Timeout.seconds(1);

    @Before
    public void init() {
        arithmetic = new Arithmetic();
    }

    @After
    public void endMethodTest() {
        System.out.println("Finish " + count++ + " test method finished");
    }

    @BeforeClass
    public static void startTesting() {
        System.out.println("Start testing");
    }

    @AfterClass
    public static void endTesting() {
        System.out.println("Finish testing");
    }

    @Test
    public void add() throws Exception {
        double result = arithmetic.add(5, 8);
        if(result != 13) fail("Method don`t work right");
    }

    @Test
    public void deduct() throws Exception {
        double result = arithmetic.deduct(5, 8);
        assertTrue(result == -3);
    }

    @Test
    public void div() throws Exception {
        double result = arithmetic.div(20, 4);
        assertTrue("Method don`t work right", result == 5);
    }

    @Test
    public void mult() throws Exception {
        double result = arithmetic.mult(2, 8);
        assertEquals(result, 16, 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void divByZero() throws Exception {
        arithmetic.div(200, 0);
    }

    @Test
    public void divByZeroWithRule() throws Exception {
        expectedException.expect(ArithmeticException.class);
        arithmetic.div(200, 0);
    }

    @Test(timeout = 1000)
    public void endlessCycle() {
        while(true) {

        }
    }

    @Test
    @Ignore
    public void testMultOneMore() throws Exception {
        double result = arithmetic.mult(2, 8);
        assertEquals(result, 16, 0.001);
    }



}