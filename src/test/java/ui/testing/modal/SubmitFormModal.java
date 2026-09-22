package ui.testing.modal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.testing.BasePage;

import javax.sql.rowset.serial.SerialStruct;

public class SubmitFormModal extends BasePage {

    private final By FIRST_NAME_INPUT = By.xpath("//*[@id='example-modal-sizes-title-lg']");
    private final By STUDENT_NAME = By.xpath("//td[text()='Student Name']/following-sibling::td");
    private final By STUDENT_EMAIL = By.xpath("//td[text()='Student Email']/following-sibling::td");
    private final By STUDENT_GENDER = By.xpath("//td[text()='Gender']/following-sibling::td");
    private final By MOBILE = By.xpath("//td[text()='Mobile']/following-sibling::td");
    private final By DATE_OF_BIRTH = By.xpath("//td[text()='Date of Birth']/following-sibling::td");
    private final By ADDRESS = By.xpath("//td[text()='Address']/following-sibling::td");
    private final By STATE_AND_CITY_INPUT = By.xpath("//td[text()='State and City']/following-sibling::td");

    public SubmitFormModal(WebDriver driver) {
        super(driver);
    }

    public String getSuccessfulText() {
        String successfulText = getWait().until(ExpectedConditions.visibilityOfElementLocated(FIRST_NAME_INPUT)).getText();
        return successfulText;
    }

    public String getStudentName() {
        String studentName = getWait().until(ExpectedConditions.visibilityOfElementLocated(STUDENT_NAME)).getText();
        return studentName;
    }

    public String getEmail() {
        String studentEmail = getWait().until(ExpectedConditions.visibilityOfElementLocated(STUDENT_EMAIL)).getText();
        return studentEmail;
    }

    public String getGender() {
        String studentGender = getWait().until(ExpectedConditions.visibilityOfElementLocated(STUDENT_GENDER)).getText();
        return studentGender;
    }

    public String getMobile() {
        String mobile = getWait().until(ExpectedConditions.visibilityOfElementLocated(MOBILE)).getText();
        return mobile;
    }

    public String getBirthDate() {
        String birthDate = getWait().until(ExpectedConditions.visibilityOfElementLocated(DATE_OF_BIRTH)).getText();
        return birthDate;
    }

    public String getAddress() {
        String address = getWait().until(ExpectedConditions.visibilityOfElementLocated(ADDRESS)).getText();
        return address;
    }

    public String getStateAndCity() {
        String stateAndCity = getWait().until(ExpectedConditions.visibilityOfElementLocated(STATE_AND_CITY_INPUT)).getText();
        return stateAndCity;
    }


}
