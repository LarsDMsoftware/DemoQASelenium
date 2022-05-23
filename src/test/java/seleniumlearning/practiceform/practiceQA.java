package seleniumlearning.practiceform;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.*;

public class practiceQA {


    @Test
    public void fillInFormFieldByField() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        practiceFormPage page = new practiceFormPage(driver);

        page.navigation();
        assertEquals(page.navigationCheck().getText(), "Practice Form");

        page.firstNameField("Lars");
        page.lastNameField("De Maere");
        page.emailField("lars.demaere@bignited.be");
        page.maleGenderRadioSelect();
        page.phoneNumberField("0123456789");
        page.subjectField("Practice QA Form");
        page.addressField("veldkant 33a 2550 kontich");
        page.dateOfBirthPicker(3,12,1995);
        page.hobbyFieldSelector("1");
        page.hobbyFieldSelector("3");


        page.selectState("Rajasthan");
        page.selectCity("Jaipur");

        page.submit();


        driver.quit();
    }

    @Test
    public void fillInFormFromPageObjectModel(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        practiceFormPage page = new practiceFormPage(driver);

        page.navigation();
        page.navigationCheck();

        page.fillInForm();

        driver.quit();
    }

}
