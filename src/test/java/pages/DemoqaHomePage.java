package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DemoqaHomePage extends BaseHelper {
    WebDriver driver;
    public DemoqaHomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    private void navigateToHomePage (String url)
    {
        driver.get(url);
    }

    private void clickOnItem ()
    {
        wdWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/h3/a")));
        WebElement shopItem = driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/h3/a"));
        shopItem.click();

    }

    public void testHomePage (String url)
    {
        navigateToHomePage(url);
        clickOnItem();
    }


}
