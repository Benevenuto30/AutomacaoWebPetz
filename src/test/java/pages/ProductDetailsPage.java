package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends HomePage{
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String price (){
        String price = driver.findElement(By.className("price-current")).getText();
        return price;
    }

    public String priceSubscribers (){
        String priceSubscribers = driver.findElement(By.className("price-subscriber")).getText();
        return priceSubscribers;
    }

    public CheckoutPage clickAddChart (){
        driver.findElement(By.id("adicionarAoCarrinho")).click();
        return new CheckoutPage(driver);
    }
}
