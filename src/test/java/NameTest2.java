import org.testng.Assert;
import org.testng.annotations.Test;

public class NameTest2 extends Methods{
    @Test
    public void C() {
        System.out.println("Start With testcase 3");
        String expextedResult = "USER";
        String actualResult = Name.checkName("ah@md");
        Assert.assertEquals(actualResult , expextedResult);
    }
    public void D() {
        System.out.println("Start With testcase 3");
        String expextedResult = "USER";
        String actualResult = Name.checkName("ah@md");
        Assert.assertEquals(actualResult , expextedResult);
    }

    public void E() {
        System.out.println("Start With testcase 3");
        String expextedResult = "USER";
        String actualResult = Name.checkName("ah@md");
        Assert.assertEquals(actualResult , expextedResult);
    }
}
