package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends HomePage{
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public ProductDetailsPage selectThirdProduct(){
        driver.findElement(By.xpath("//*[@id=\"gridProdutos\"]/li[3]")).click();
        return new ProductDetailsPage(driver);
    }

    public String priceSubscribers (){
        String priceSubscribers = driver.findElement(By.xpath("//*[@id=\"gridProdutos\"]/li[3]/a/div[5]/div/span")).getText();
        return priceSubscribers;
    }

    public String price (){
        String price = driver.findElement(By.xpath("//*[@id=\"gridProdutos\"]/li[3]/a/div[4]/div[2]")).getText();
        return price;
    }
}
