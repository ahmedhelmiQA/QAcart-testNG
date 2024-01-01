import org.testng.Assert;
import org.testng.annotations.*;

public class NameTest extends Methods{


    @Test
    public void should_returns_USER_if_the_name_contains_special_character2() {
        System.out.println("Start With testcase 1");
        String expextedResult = "USER";
        String  actualResult = Name.checkName("ahmed.");
        Assert.assertEquals(actualResult , expextedResult);
    }
    @Test
    public void should_returns_USER_the_correct_name() {
        System.out.println("Start With testcase 2");
        String expectedResult = "ahmed";
        String actualResult = Name.checkName("ahmed");
        Assert.assertEquals(actualResult , expectedResult);
    }
}
