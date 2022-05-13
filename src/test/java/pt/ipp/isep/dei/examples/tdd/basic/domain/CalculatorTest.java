package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @BeforeAll
    public static void classSetUp() {
        //HACK: for demonstration purposes only
        System.out.println(
                "This is a CalculatorTest class method and takes place before any @Test is executed");
    }

    @AfterAll
    public static void classTearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "This is a CalculatorTest class method and takes place after all @Test are executed");
    }

    @BeforeEach
    public void setUp() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place before each @Test is executed");
    }

    @AfterEach
    public void tearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place after each @Test is executed");
    }

    @Test
    @Disabled
    public void failingTest() {
        fail("a disabled failing test");
    }

    /**
     * Test to ensure two positive numbers are summed correctly.<p>
     * <p>
     * For demonstration purposes the Arrange/Act/Assert syntax is used:<p>
     * Arrange: one positive number (three) and another positive number (two).<p>
     * Act: sum both numbers (three and two).<p>
     * Assert: the result is five.
     */
    @Test
    public void ensureThreePlusTwoEqualsFive() {

        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 5;
        int firsOperand = 3;
        int secondOperand = 2;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test to ensure positive and negative numbers are summed correctly.<p>
     * <p>
     * For demonstration purposes the Arrange/Act/Assert syntax is used:<p>
     * Arranje a positive number (three) and a negative number (minus two)<p>
     * Act I sum three to minus two<p>
     * Assert the sum result should be one.
     */
    @Test
    public void ensureThreePlusMinusTwoEqualsOne() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 3;
        int secondOperand = -2;
        int expectedResult = 1;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void checkIfFiveMinusThreeEqualsToTwo() {
        int firstOperand = 5;
        int secondOperand = 3;
        int expected=2;
        int result= new Calculator().subtract(firstOperand, secondOperand);
        assertEquals(expected, result);
    }
    @Test
    void checkIfNegativeFiveMinusNegativeFiveEqualsToNegativeZero(){
        int firstOperand = -5;
        int secondOperand = -5;
        int expected=0;
        int result= new Calculator().subtract(firstOperand, secondOperand);
        assertEquals(expected, result);
    }

    @Test
    void checkIfFiveMinusNegativeFiveEqualsToTen(){
        int firstOperand = 5;
        int secondOperand = -5;
        int expected=10;
        int result= new Calculator().subtract(firstOperand, secondOperand);
        assertEquals(expected, result);
    }

    @Test
    void checkIfTenDividedByTwoEqualsToFive() {
        int firstOperand = 10;
        int secondOperand = 2;
        int expected=5;
        int result= new Calculator().divide(firstOperand, secondOperand);
        assertEquals(expected, result);
    }

    @Test
    void checkIfTenDividedByNegativeFiveEqualsToNegativeTwo(){
        int firstOperand = 10;
        int secondOperand = -5;
        int expected=-2;
        int result= new Calculator().divide(firstOperand, secondOperand);
        assertEquals(expected, result);
    }

    @Test
    void checkIfNegativeTenDividedByNegativeFiveEqualsToTwo(){
        int firstOperand = -10;
        int secondOperand = -5;
        int expected=2;
        int result= new Calculator().divide(firstOperand, secondOperand);
        assertEquals(expected, result);
    }

    @Test
    void checkIfExceptionIsThrownWhenDivisorIsZero(){
        int firstOperand = -10;
        int secondOperand = 0;
        assertThrows(IllegalArgumentException.class, () ->{
            new Calculator().divide(firstOperand, secondOperand);
                });
    }

    @Test
    void checkIfFiveTimesFiveEqualsTo25() {
        int firstOperand = 5;
        int secondOperand = 5;
        int expected=25;
        int result= new Calculator().multiply(firstOperand, secondOperand);
        assertEquals(expected, result);
    }

    @Test
    void checkIfFiveTimesNegativeFiveEqualsToNegative25() {
        int firstOperand = 5;
        int secondOperand = -5;
        int expected=-25;
        int result= new Calculator().multiply(firstOperand, secondOperand);
        assertEquals(expected, result);
    }

    @Test
    void checkIfFiveTimesZeroEqualsToZero() {
        int firstOperand = 5;
        int secondOperand = 0;
        int expected=0;
        int result= new Calculator().multiply(firstOperand, secondOperand);
        assertEquals(expected, result);
    }

    @Test
    void checkIfFactorialZeroEqualsToOne() {
        int firstOperand=0;
        int expected=1;
        int result=new Calculator().factorial(firstOperand);
        assertEquals(expected, result);
    }

    @Test
    void checkIfFactorial5EqualsTo20() {
        int firstOperand=5;
        int expected=20;
        int result=new Calculator().factorial(firstOperand);
        assertEquals(expected, result);
    }

    @Test
    void checkIfOneIsReturnedWhenInputIsNegative(){
        int firstOperand=-5;
        int expected=1;
        int result=new Calculator().factorial(firstOperand);
        assertEquals(expected, result);
    }
}



