import org.testng.Assert;
import org.testng.annotations.*;

public class NameTest {

    @BeforeClass  // before
    public void beforeclass(){
        System.out.println("i am inside the before class");
    }
    @AfterClass   // after
    public void afterclass(){
        System.out.println("i am inside the after class");
    }


@BeforeMethod   // before each
public void beforemethod(){
    System.out.println("i am inside the before method");
}
@AfterMethod   // after each
public void aftermethod(){
    System.out.println("i am inside the after method");
}


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
