package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import support.Web;

public class AddProduct {

    private WebDriver driver;

    @Test
    public void testAddProduct(){
        driver = Web.createChrome();
        new HomePage(driver).search("Ração")
                .clickSearch();
    }

}
