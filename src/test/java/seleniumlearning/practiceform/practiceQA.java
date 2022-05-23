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
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        practiceFormPage page = new practiceFormPage(driver);

        page.driver.get("https://demoqa.com/automation-practice-form");

        WebElement headerSite = practiceFormPage.driver.findElement(By.className("main-header"));
        assertEquals(headerSite.getText(), "Practice Form");

        page.firstNameField("Lars");
        page.driver.findElement(By.id("lastName")).sendKeys("De Maere");
        page.driver.findElement(By.id("userEmail")).sendKeys("lars.demaere@bignited.be");
        page.driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
        page.driver.findElement(By.id("userNumber")).sendKeys("0123456789");
        page.driver.findElement(By.id("subjectsInput")).sendKeys("Practice QA Form");
        page.driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
        page.driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
        page.driver.findElement(By.id("currentAddress")).sendKeys("veldkant 33a 2550 kontich");
        page.driver.findElement(By.id("dateOfBirthInput")).click();


        Select datepickerMonth = new Select(page.driver.findElement(By.className("react-datepicker__month-select")));
        datepickerMonth.selectByIndex(11);
        Select datepickerYear = new Select(page.driver.findElement(By.className("react-datepicker__year-select")));
        datepickerYear.selectByValue("1995");
        page.driver.findElement(By.xpath("//div[text()='3']")).click();


        page.driver.findElement(By.id("react-select-3-input")).sendKeys("Rajasthan" + Keys.ENTER);
        page.driver.findElement(By.id("react-select-4-input")).sendKeys("Jaipur" + Keys.ENTER);

        page.driver.findElement(By.id("firstName")).submit();
    }

}
