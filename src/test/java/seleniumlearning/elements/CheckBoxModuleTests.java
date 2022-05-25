package seleniumlearning.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;


public class CheckBoxModuleTests {

    @Test
    public void checkBoxExpand(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        CheckBoxModule page = new CheckBoxModule(driver);

        page.navigation();




        page.expandFileStructBtn();


        driver.quit();
    }

}
