import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;

/**
 * The test class SkillBuilder3Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SkillBuilder1bTest extends OutputTest
{
    /**
     * Default constructor for test class SkillBuilder2Test
     */
    public SkillBuilder1bTest()
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
        super.setUp();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        super.tearDown();
    }


    @Test
    public void testMain_1()
    {
        setTestInput("12\n15");
        SkillBuilder1b.main(new String[]{});
        String expected = "Wall area: 180(.0)? square feet\n";
        expected += "Paint needed: 0.514\\d+ gallons\n";
        expected += "Cans needed: 1 can\\(s\\)";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        assertTrue(Pattern.compile(expected.replaceAll("\\s",""))
                .matcher(actual.replaceAll("\\s","")).find(),message);
    }

    public void testMain_2()
    {
        setTestInput("22\n33");
        SkillBuilder1b.main(new String[]{});
        String expected = "Wall area: 726(.0)? square feet\n";
        expected += "Paint needed: 2.074\\d+ gallons\n";
        expected += "Cans needed: 3 can\\(s\\)";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        assertTrue(Pattern.compile(expected.replaceAll("\\s",""))
                .matcher(actual.replaceAll("\\s","")).find(),message);
    }
}
