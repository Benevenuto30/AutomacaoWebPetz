package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    protected WebDriver driver;

    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public HomePage search(String product){
        driver.findElement(By.id("search")).sendKeys(product);
        return this;
    }
    public ProductsPage clickSearch(){
        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
        return new ProductsPage(driver);
    }

}
