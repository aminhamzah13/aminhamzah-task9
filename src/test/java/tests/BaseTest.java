package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        initializeWebDriver();
        maximizeWindow();
    }

    @AfterClass
    public void tearDown() {
        closeWebDriver();
    }

    private void initializeWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    private void maximizeWindow() {
        driver.manage().window().maximize();
    }

    private void closeWebDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}