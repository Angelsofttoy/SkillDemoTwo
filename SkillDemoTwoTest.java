import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTwoTest {

    @Test
    public void subtractionTest(){
        SkillDemoTwo.subtraction(3, 2);

        assertEquals(2, SkillDemoTwo.subtraction(3, 2));
    }

}

