package seleniumlearning.elements;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class TextBoxModule {

    WebDriver driver;

    public TextBoxModule(WebDriver driver)
    {
        this.driver = driver;
    }

    public void navigation(){
        this.driver.get("https://demoqa.com/text-box");
    }

    public void fullNameField(String input){
        this.driver.findElement(By.id("userName")).sendKeys(input);
    }

    public void emailField(String input){
        this.driver.findElement(By.id("userEmail")).sendKeys(input);
    }

    public void currentAddressField(String input){
        this.driver.findElement(By.id("currentAddress")).sendKeys(input);
    }

    public void permanentAddressField(String input){
        this.driver.findElement(By.id("permanentAddress")).sendKeys(input);
    }
}
