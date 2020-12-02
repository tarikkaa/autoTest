package efsuWeb;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSetUp {

    public ChromeDriver driver;

    @Before
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Start");
    }

    @After
    public void close() {
        driver.quit();
        System.out.println("Finish");
    }



}
