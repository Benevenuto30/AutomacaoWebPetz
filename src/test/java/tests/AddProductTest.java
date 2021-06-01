package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ProductsPage;
import support.Generate;
import support.Screenshot;
import support.Web;
import static org.junit.Assert.*;
@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "searchProductsTest.csv")



public class AddProductTest {

    private WebDriver driver;

    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp(){
        driver = Web.createChrome();
    }

    @Test
    public void testAddProductToChart(@Param(name="search")String searchProduct){
        String priceProductPage = new HomePage(driver).search(searchProduct)
                                                      .clickSearch().price();
        String priceSubProductPage = new ProductsPage(driver)
                                                      .priceSubscribers();
        String priceProductDetailsPage = new ProductsPage(driver)
                                                      .selectThirdProduct().price();
        String priceSubProductDetaislPage = new ProductDetailsPage(driver)
                                                      .priceSubscribers();
        String validadeChart = new ProductDetailsPage(driver).clickAddChart()
                                                      .MyChart();

        assertEquals(priceProductPage,priceProductDetailsPage);
        Screenshot.take(driver,"screenshot/"+ Generate.dateTimeForFile()+test.getMethodName()+".png");
        assertEquals(priceSubProductPage,priceSubProductDetaislPage);
        Screenshot.take(driver,"screenshot/"+ Generate.dateTimeForFile()+test.getMethodName()+".png");
        assertEquals(validadeChart,"insira seu cupom/vale");
        Screenshot.take(driver,"screenshot/"+ Generate.dateTimeForFile()+test.getMethodName()+".png");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
