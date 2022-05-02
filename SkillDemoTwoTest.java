import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTwoTest {

    @Test
    public void subtractionTest(){
        SkillDemoTwo.subtraction(3, 2);

        assertEquals(1, SkillDemoTwo.subtraction(3, 2));
    }

}

