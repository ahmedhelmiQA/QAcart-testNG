import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Methods {
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


}
