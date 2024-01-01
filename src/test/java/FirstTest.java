import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTest {


//    @Test
//    public void should_returns_USER_if_the_name_contains_special_character2() {
//        System.out.println("Start With testcase 1");
//        String expextedResult = "USER";
//        String  actualResult = Name.checkName("ahmed.");
//        Assert.assertEquals(actualResult , expextedResult);
//    }
//    @Test
//    public void should_returns_USER_the_correct_name() {
//        System.out.println("Start With testcase 2");
//        String expectedResult = "ahmed";
//        String actualResult = Name.checkName("ahmed");
//        Assert.assertEquals(actualResult , expectedResult);
//    }

    @Test  (groups = "sanity")              // (priority = 2)
    public void A() {
        String expextedResult = "USER";
        String  actualResult = Name.checkName("ahmed.");
        Assert.assertEquals(actualResult , expextedResult);
    }
    @Test    (groups = "regression")                 //(priority = 1)
    public void B() {
        String expectedResult = "ahmed";
        String actualResult = Name.checkName("ahmed");
        Assert.assertEquals(actualResult , expectedResult);
    }
}
