import org.testng.annotations.*;

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


    @BeforeTest   // before each
    public void beforetest(){
        System.out.println("i am inside the before test");
    }
    @AfterTest  // after each
    public void aftertest(){
        System.out.println("i am inside the after test");
    }

    @BeforeSuite   // before each
    public void beforesout(){
        System.out.println("i am inside the before suite");
    }
    @AfterSuite   // after each
    public void aftersuite(){
        System.out.println("i am inside the after suite");
    }

}
