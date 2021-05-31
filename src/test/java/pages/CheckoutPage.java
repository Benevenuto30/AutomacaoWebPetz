package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends HomePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public String MyChart(){
        String MyChart = driver.findElement(By.xpath("//*[@id=\"botaoCupom\"]")).getText();
        return MyChart;
    }
}
