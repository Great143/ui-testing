package ui.testing.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.testing.BasePage;
import ui.testing.data.TextBoxData;
import ui.testing.links.DemoQaLinks;
import ui.testing.output.TextBoxOutput;

public class TextBoxPage extends BasePage {

    private final By FULL_NAME_INPUT = By.xpath("//*[@id='userName']");
    private final By EMAIL_INPUT = By.xpath("//*[@id='userEmail']");
    private final By CURRENT_ADDRESS_INPUT = By.xpath("//*[@id='currentAddress']");
    private final By PERMANENT_ADDRESS_INPUT = By.xpath("//*[@id='permanentAddress']");
    private final By SUBMIT_BUTTON = By.xpath("//*[@id='submit']");

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public TextBoxPage fieldFullName(String fullName) {
        type(FULL_NAME_INPUT, fullName);
        return this;
    }

    public TextBoxPage fieldEmail(String email) {
        type(EMAIL_INPUT, email);
        return this;
    }

    public TextBoxPage fieldCurrentAddress(String currentAddress) {
        type(CURRENT_ADDRESS_INPUT, currentAddress);
        return this;
    }

    public TextBoxPage fieldPermanentAddress(String permanentAddress) {
        type(PERMANENT_ADDRESS_INPUT, permanentAddress);
        return this;
    }

    public TextBoxPage open() {
        super.openURL(DemoQaLinks.TEXT_BOX);
        return this;
    }

    public TextBoxOutput clickSubmitButton() {
        scrollTo(SUBMIT_BUTTON);
        click(SUBMIT_BUTTON);
        return new TextBoxOutput(getDriver());
    }
}
