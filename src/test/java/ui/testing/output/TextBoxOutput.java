package ui.testing.output;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.testing.BasePage;

public class TextBoxOutput extends BasePage {

    private final By NAME_INPUT = By.xpath("//*[@id='name']");
    private final By EMAIL_INPUT = By.xpath("//*[@id='email']");
    private final By CURRENT_ADDRESS = By.xpath("//*[@id='currentAddress']");
    private final By PERMANENT_ADDRESS = By.xpath("//*[@id='permanentAddress']");

    public TextBoxOutput(WebDriver driver) {
        super(driver);
    }

    public String getName() {
        String name = getWait().until(ExpectedConditions.visibilityOfElementLocated(NAME_INPUT)).getText().replace("Name:", "");
        return name;
    }

    public String getEmail() {
        String email = getWait().until(ExpectedConditions.visibilityOfElementLocated(EMAIL_INPUT)).getText().replace("Email:", "");
        return email;
    }

    public String getCurrentAddress() {
        String currentAddress = getWait().until(ExpectedConditions.visibilityOfElementLocated(CURRENT_ADDRESS)).getText().replace("Current Address :", "");
        return currentAddress;
    }

    public String getPermanentAddress() {
        String permanentAddress = getWait().until(ExpectedConditions.visibilityOfElementLocated(PERMANENT_ADDRESS)).getText().replace("Permananet Address :", "");
        return permanentAddress;
    }
}
