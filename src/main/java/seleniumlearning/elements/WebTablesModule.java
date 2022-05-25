package seleniumlearning.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesModule {

    //addNewRecordButton
    WebDriver driver;
    public WebTablesModule(WebDriver driver){
        this.driver = driver;
    }
    public WebTablesModule navigation(){
        this.driver.get("https://demoqa.com/webtables");
        return this;
    }
    public WebTablesModule addNewRecordButton(){
        this.driver.findElement(By.id("addNewRecordButton")).click();
        return this;
    }
    public String addNewRecordButtonCheck(){
        return this.driver.findElement(By.id("registration-form-modal")).getText();
    }

    public WebTablesModule addFirstName(String input){
        this.driver.findElement(By.id("firstName")).sendKeys(input);
        return this;
    }

    public WebTablesModule addLastName(String input){
        this.driver.findElement(By.id("lastName")).sendKeys(input);
        return this;
    }

    public void quit(){
        this.driver.quit();
    }
}
