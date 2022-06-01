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

        String firstName = "Lars";
        String lastName = "De Maere";
        String email = "lars.demaere@bignited.be";
        String age = "25";
        String salary = "1";
        String department = "QA Testing";

        page.addFirstName(firstName)
                .addLastName(lastName)
                .addEmail(email)
                .addAge(age)
                .addSalary(salary)
                .addDepartment(department)
                .submitNewRecord();

        assertEquals(firstName,page.submitRecordCheck(firstName));
        assertEquals(lastName,page.submitRecordCheck(lastName));
        assertEquals(email,page.submitRecordCheck(email));
        assertEquals(age,page.submitRecordCheck(age));
        assertEquals(salary,page.submitRecordCheck(salary));
        assertEquals(department,page.submitRecordCheck(department));


    }
}
