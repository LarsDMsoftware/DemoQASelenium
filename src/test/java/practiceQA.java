import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class practiceQA {


    @Test
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement headerSite = driver.findElement(By.className("main-header"));
        assertEquals(headerSite.getText(), "Practice Form");

        driver.findElement(By.id("firstName")).sendKeys("Lars");
        driver.findElement(By.id("lastName")).sendKeys("De Maere");
        driver.findElement(By.id("userEmail")).sendKeys("lars.demaere@bignited.be");
        driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("0123456789");
        driver.findElement(By.id("subjectsInput")).sendKeys("Practice QA Form");
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("veldkant 33a 2550 kontich");
        driver.findElement(By.id("dateOfBirthInput")).click();

        Select datepickerMonth = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        datepickerMonth.selectByIndex(11);

        Select datepickerYear = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        datepickerYear.selectByValue("1995");

        driver.findElement(By.xpath("//div[text()='3']")).click();
    }

}
