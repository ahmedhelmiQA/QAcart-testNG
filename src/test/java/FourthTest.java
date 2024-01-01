import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FourthTest {

    @Test
    public void a(){
        SoftAssert softAssert = new SoftAssert(); //  It does not throw an exception when an assert fails.
        System.out.println("open the website");
//        boolean actualResult = true;
//        Assert.assertTrue(actualResult);    // if the result false it doesn't execute the next step

        boolean actualResult = false;
        softAssert.assertTrue(actualResult);
        System.out.println("close the browser");

    }
}
