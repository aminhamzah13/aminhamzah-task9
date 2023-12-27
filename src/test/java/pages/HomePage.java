package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final WebDriver driver;
    private final By searchButton = By.xpath("//a[normalize-space()='Search']");
    private final By firstPrice = By.xpath("//div[2]//div[2]//div[1]//div[2]//div[2]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        String url = "https://www.makemytrip.com/";
        driver.get(url);
    }

    public void clickSearch() {
        WebElement searchBtn = driver.findElement(searchButton);
        searchBtn.click();
        // Tunggu sebentar untuk memastikan halaman terload
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getFirstPrice() {
        // Tunggu sebentar untuk memastikan elemen terlihat
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement firstPriceElement = driver.findElement(firstPrice);
        return firstPriceElement.getText();
    }
}
