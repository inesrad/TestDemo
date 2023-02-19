package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ItemPage extends BaseHelper {

    WebDriver driver;
    public ItemPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    private void colorSelector ()
    {
       // WebElement colorSelection = driver.findElement(By.id("pa_color"));
    // colorSelection.click();

        WebElement clickColor = driver.findElement(By.xpath("//*[@id=\"pa_color\"]/option[2]"));
        clickColor.click();
    }

    private void sizeSelector ()
    {
        WebElement sizeSelection = driver.findElement(By.id("pa_size"));
        sizeSelection.click();

        WebElement clickSize = driver.findElement(By.xpath("//*[@id=\"pa_size\"]/option[3]"));
        clickSize.click();

        WebElement addToCart = driver.findElement( By.xpath("//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/button"));
        addToCart.click();

    }

    private void viewCart ()
    {
        WebElement viewCartButton = driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div/a"));
        viewCartButton.click();
    }

    public void chooseItem ()
    {
        colorSelector();
        sizeSelector();
        viewCart();
    }
}
