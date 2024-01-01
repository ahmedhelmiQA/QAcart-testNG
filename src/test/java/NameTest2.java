import org.testng.Assert;
import org.testng.annotations.Test;

public class NameTest2 extends Methods{
    @Test
    public void should_returns_USER_if_the_name_contains_special_character1() {
        System.out.println("Start With testcase 3");
        String expextedResult = "USER";
        String actualResult = Name.checkName("ah@md");
        Assert.assertEquals(actualResult , expextedResult);
    }
}
