import org.openqa.selenium.By;

public class HomeworkLocators {
    // 1a.lv homepage
    private final By COOKIES_DETAILS_BTN = By.id("CybotCookiebotDialogBodyLevelDetailsButton");
    private final By CONTACTS_LINK = By.xpath("(.//li[@class='site-top__menu-right-item']/a)[2]");
    private final By MAIN_LOGO = By.className("main-logo");
    private final By MAIN_SEARCH_SUBMIT_BTN = By.className("main-search__submit");
    private final By CART_BTN = By.xpath(".//div[@class='cart-block']/a");
    private final By MAIN_MENU_ICON = By.xpath(".//a[@class='main-menu__handle']/i");
    // Sports and Fitness icon INCORRECT!!!
    private final By SPORTS_AND_LEISURE_LISTITEM_ICON = By.xpath(".//ul[@class='submenu-lvl1__list']/li[11]/a/svg[@class='submenu-lvl1__list-icon icon-svg']");
    private final By GAMING_CONSOLES_SHOW_ALL_LINK = By.xpath("(.//div[@class='submenu-lvl2__block-title submenu-lvl2__block-title--show-all']/a[@href='/c/spelu-konsoles-un-piederumi/a4h'])[2]");

    // amazon.de homepage
    private final By DISPATCH_ALERT_CHANGE_ADDRESS_BTN = By.xpath(".//input[@data-action-type='SELECT_LOCATION']");
    private final By MAIN_SEARCH_INPUT = By.name("field-keywords");
    private final By REGION_LANGUAGE_SELECT = By.id("icp-nav-flyout");
    private final By NAVIGATION_CART_BTN = By.xpath(".//a[@id='nav-cart']");
    private final By NAVIGATION_HAMBURGER_MENU = By.xpath(".//a[@id='nav-hamburger-menu']");
    // Always 1st card! But how to find a card with specific offer???
    private final By HOMEPAGE_OFFER_CARD_1 = By.xpath(".//div[@data-card-metrics-id='fluid-quad-image-label-v2_desktop-gateway-atf_1']");

    // delfi.lv
    private final By TODAYS_NAMEDAYS = By.xpath(".//ul[@class='horizontal-list text-nowrap']//a[@href='https://www.delfi.lv']/span[@class='btn__content']");
    private final By CONTACTS_HEADER_LINK = By.xpath(".//ul[@class='horizontal-list text-nowrap']//a[@href='https://www.delfi.lv/kontakti']/span[@class='btn__content']");
    private final By HEADER_LOGO = By.xpath(".//a[@class='logo logo-link']");
    private final By BUSINESS_CATEGORY_LINK = By.xpath(".//li/a[@href='https://www.delfi.lv/bizness']");
    private final By RUS_DELFI_LINK = By.xpath("(.//li/a[@href='https://rus.delfi.lv'])[2]");
    private final By NEWS_SECTIONS_LIST = By.xpath("(.//div[@class='header-menu__horizontal header-menu__horizontal--center col']/ul[@class='horizontal-list text-nowrap'])[2]");
    private final By SECOND_HEADLINE_ARTICLE_TITLE = By.xpath("(.//article[@class='headline'])[2]//h4");

    // sportsdirect.lv
    private final By SEARCH_INPUT = By.xpath(".//input[@name='descriptionfilter']");
    private final By USER_PROFILE_MENU = By.className("userLoginContainer");
    private final By MENS_CAROUSEL_CATEGORY_BTN = By.xpath(".//div[@data-testid='quick-links']//a[@href='/mens']");
    private final By SHOP_CHRISTMAS_HEROBLOCK_ITEM = By.xpath("(.//div[@id='cms-home-placement-2']//a[@href='/christmas'])[1]");
    private final By DOTW_HEROBLOCK_BTN = By.xpath("(.//div[@id='cms-home-placement-2']//a[@href='/yeezy'])[2]");
    private final By GBB_SECTION_TITLE = By.xpath(".//section[@id='section-1-gifts-by-brands']//h2");

    // Some restricted site - just to play with commits
    private final By SEARCH_INPUT_NEW = By.xpath(".//input[@name='descriptionfilter']");
}
