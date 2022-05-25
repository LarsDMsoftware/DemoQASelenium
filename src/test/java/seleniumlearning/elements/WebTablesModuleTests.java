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

        page.addFirstName("Lars")
                .addLastName("De Maere")
                .addEmail("lars.demaere@bignited.be")
                .addAge("25")
                .addSalary("1")
                .addDepartment("QA Testing")
                .submitNewRecord();

        assertEquals("Lars",page.submitRecordCheck("Lars"));
        assertEquals("De Maere",page.submitRecordCheck("De Maere"));
        assertEquals("lars.demaere@bignited.be",page.submitRecordCheck("lars.demaere@bignited.be"));
        assertEquals("25",page.submitRecordCheck("25"));
        assertEquals("1",page.submitRecordCheck("1"));
        assertEquals("QA Testing",page.submitRecordCheck("QA Testing"));


    }
}
