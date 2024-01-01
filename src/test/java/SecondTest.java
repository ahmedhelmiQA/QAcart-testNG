import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest extends Methods{
    @Test    (groups ={ "sanity","regression"})
    public void C() {
        System.out.println("Start With testcase 3");
        String expextedResult = "USER";
        String actualResult = Name.checkName("ah@md");
        Assert.assertEquals(actualResult , expextedResult);
    }
    @Test   (groups = "regression")
    public void D() {
        System.out.println("Start With testcase 3");
        String expextedResult = "USER";
        String actualResult = Name.checkName("ah@md");
        Assert.assertEquals(actualResult , expextedResult);
    }
    @Test   (groups = "regression")
    public void E() {
        System.out.println("Start With testcase 3");
        String expextedResult = "USER";
        String actualResult = Name.checkName("ah@md");
        Assert.assertEquals(actualResult , expextedResult);
    }
}
