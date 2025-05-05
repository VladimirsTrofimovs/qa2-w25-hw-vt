import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.BaseFunc;

public class CartTest {
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By MAIN_MENU = By.xpath(".//ul[@class = 'submenu-lvl1__list']");
    private final By MAIN_MENU_ITEM = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item')]");

    @Test
    public void itemsInCartCheckOnPageObject() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openHomePage();
    }
}
