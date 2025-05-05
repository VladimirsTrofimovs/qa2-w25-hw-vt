package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseFunc {
    private WebDriver driver;

    public BaseFunc() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void goToUrl(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) url = "http://" + url;

        driver.get(url);
    }

    public void openHomePage() {
        goToUrl("1a.lv");
    }
}
