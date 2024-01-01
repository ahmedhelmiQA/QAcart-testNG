import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTest {
    @Parameters({"browser","version"})

    @Test
    public void A(String browser,String version ) {
        System.out.println("Open " + browser + " browser with version " + version);
    }
}
