package seleniumlearning.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class WebTablesModuleTests {

    public static WebTablesModule page;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        page = new WebTablesModule(driver);
    }

    @Test
    public void addNewRecordTest(){
        page.navigation().addNewRecordButton();
        assertEquals("Registration Form",page.addNewRecordButtonCheck());

        page.addFirstName("Lars").addLastName("De Maere");

    }
}
