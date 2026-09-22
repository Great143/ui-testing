package ui.testing;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.testing.links.DemoQaLinks;

import java.sql.Driver;
import java.time.Duration;


public class BasePage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public BasePage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public BasePage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    protected WebElement find(By locator) {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }
    protected void click(By locator) {
        wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        ).click();
    }
    protected void type(By locator, String text) {
        WebElement element = find(locator);
        element.clear();
        element.sendKeys(text);
    }
    protected String getText(By locator) {
        return find(locator).getText();
    }
    public void scrollTo (By locator) {
        WebElement element = find(locator);
        Actions actions = new Actions(driver);
        actions.scrollToElement(element).perform();
    }

    public void openURL(String url) {
        driver.get(url);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void selectByVisibleDropdown(By locator, String text) {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        select.selectByVisibleText(text);

    }

//    public void select(By locator) {
//        WebElement element = find(locator);
//        Actions actions = new Actions(driver);
//        actions.
//    }

}
