package efsuWeb;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class FirstWebTest extends WebSetUp {


    @Test
    public void Test1() {
        driver.get("https://translate.google.com/");
        String title = driver.getTitle();
        Assert.assertEquals("Google Translate", title);

    }
    @Test
    public void TestEFSU() throws InterruptedException {
        driver.get("https://tarhel7:9443");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        String title = driver.getTitle();
        Assert.assertEquals("ESET File Security", title);

        String parentGUID = driver.getWindowHandle();

        driver.findElement(By.id("loginInputUsername")).sendKeys("Administrator");
        driver.findElement(By.id("loginInputPassword")).sendKeys("Passw0rd");
        driver.findElement(By.cssSelector("#root > div > div > div > div > div.Login__loginBox--2bpeyfd3ZF > div > div > div.Login__formBox--2b-RW7_cco > div > form > div.BasicForm__btnHolder--1UvObyTDgo > button")).click();

        driver.findElement(By.xpath("//*[@id=\"menu0\"]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu1\"]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu2\"]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu3\"]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu4\"]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu5\"]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu6\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"feedback_modal\"]/div[2]/div[2]/div/div/div[1]/div/div/div/div[2]/p")).click();
        driver.findElement(By.xpath("//*[@id=\"feedback_modal\"]/div[2]/div[2]/div/div/div[3]/div/div/div/div[2]")).click();

        driver.switchTo().window(parentGUID);

        driver.findElement(By.cssSelector("#feedback_modal > div.sc-jAaTju.fiSsbp.Modal__modal--Fr9Lyilhos.info.fadeInDown.Modal__modalVisible--1b1MnG4db5 > div.sc-cMljjf.iFjFBH.Modal__header--1nqRVNQ2Py > div.sc-cvbbAY.hUphyz.Modal__icons--E2aFZKeL1n > div > svg")).click();

        driver.findElement(By.xpath(Menu.dashboard)).click();

        Thread.sleep(5000);

    }



}
