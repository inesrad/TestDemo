package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.DemoqaHomePage;
import pages.ItemPage;

import java.util.Locale;

public class DemoqaTest  extends BaseTest{
    @Test
    public void Demoquasmoketest() throws InterruptedException {
        String url="https://shop.demoqa.com/";
        String Name = "PINK DROP SHOULDER OVERSIZED T SHIRT";
        String Size = "37";
        DemoqaHomePage naslovnaHomePage = new DemoqaHomePage(driver); //Open home page
        naslovnaHomePage.testHomePage(url);

        ItemPage selectedItem = new ItemPage(driver);  // Select item from page
        selectedItem.chooseItem();

        // checking is selected item added in cart
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"post-6\"]/div/div/form/table/tbody/tr[1]/td[2]/a")));
        WebElement itemName = driver.findElement(By.xpath("//*[@id=\"post-6\"]/div/div/form/table/tbody/tr[1]/td[2]/a"));
        String str = itemName.findElement(By.xpath("//*[@id=\"post-6\"]/div/div/form/table/tbody/tr[1]/td[2]/a")).getText();
        Assert.assertTrue(itemName.getText().contains(Name));
        System.out.println("Choosed item is: " + str);

        //checking the size of item
        WebElement itemSize = driver.findElement(By.xpath("//*[@id=\"post-6\"]/div/div/form/table/tbody/tr[1]/td[2]/dl/dd/p"));
        String num = itemSize.findElement(By.xpath("//*[@id=\"post-6\"]/div/div/form/table/tbody/tr[1]/td[2]/dl/dd/p")).getText();
        Assert.assertTrue(itemSize.getText().contains(Size));
        System.out.print("Choosed size is: " + num);

        Thread.sleep(1_000);
    }

}
