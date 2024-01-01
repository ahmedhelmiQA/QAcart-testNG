import org.testng.Assert;
import org.testng.annotations.Test;

public class NameTest {



    @Test
    public void should_returns_USER_if_the_name_contains_special_character2() {
        String expextedResult = "USER";
        String  actualResult = Name.checkName("ahmed.");
        Assert.assertEquals(actualResult , expextedResult);
    }
    @Test
    public void should_returns_USER_the_correct_name() {
        String expectedResult = "ahmed";
        String actualResult = Name.checkName("ahmed");
        Assert.assertEquals(actualResult , expectedResult);
    }
}
