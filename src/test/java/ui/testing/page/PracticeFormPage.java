package ui.testing.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ui.testing.BasePage;
import ui.testing.links.DemoQaLinks;
import ui.testing.modal.SubmitFormModal;
import ui.testing.model.Gender;

import java.sql.Driver;

public class PracticeFormPage extends BasePage {

    private final By firstNameInput = By.xpath("//*[@id='firstName']");
    private final By LAST_NAME_INPUT = By.xpath("//*[@id='lastName']");
    private final By EMAIL_INPUT = By.xpath("//*[@id='userEmail']");
    private final By GENDER_MALE = By.xpath("//*[@id='gender-radio-1']");
    private final By GENDER_FEMALE = By.xpath("//*[@id='gender-radio-2']");
    private final By GENDER_OTHER = By.xpath("//*[@id='gender-radio-3']");
    private final By MOBILE_NUMBER_INPUT = By.xpath("//*[@id='userNumber']");
    private final By DATE_INPUT = By.id("dateOfBirthInput");
    private final By PREV_MONTH_BUTTON = By.xpath("//*[contains(@aria-label, 'Previous Month') or contains(@class, 'react-datepicker__navigation--previous')]");
    private final By NEXT_MONTH_BUTTON = By.xpath("//*[contains(@aria-label, 'Next Month') or contains(@class, 'react-datepicker__navigation--next')]");
    private final By SUBJECT_INPUT = By.xpath("//*[@id='subjectsInput']");
    private final By HOBBIES_SPORT = By.xpath("//*[@id='hobbies-checkbox-1']");
    private final By HOBBIES_READING = By.xpath("//*[@id='hobbies-checkbox-2']");
    private final By HOBBIES_MUSIC = By.xpath("//*[@id='hobbies-checkbox-3']");
    private final By PICTURE_LOAD_CLICK = By.xpath("//*[@id='uploadPicture']");
    private final By CURRENT_ADDRESS_INPUT = By.xpath("//*[@id='currentAddress']");
    private final By STATE_DROPDOWN = By.xpath("//*[@id='state']");
    private final By STATE_SEARCH_INPUT =By.xpath("//*[@id='react-select-3-input']");
    private final By CITY_DROPDOWN = By.xpath("//*[@id='city']");
    private final By CITY_SEARCH_INPUT = By.xpath("//*[@id='react-select-4-input']");
    private final By SUBMIT_BUTTON = By.xpath("//*[@id='submit']");

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    public PracticeFormPage fieldFirstName(String name) {
        type(firstNameInput, name);
        return this;
    }

    public PracticeFormPage fieldLastName(String lastName) {
        type(LAST_NAME_INPUT, lastName);
        return this;
    }

    public PracticeFormPage fieldEmail(String email) {
        type(EMAIL_INPUT, email);
        return this;
    }

    public PracticeFormPage selectGender(Gender gender) {
        switch (gender) {
            case Gender.FEMALE -> click(GENDER_FEMALE);
            case Gender.MALE -> click(GENDER_MALE);
            case Gender.OTHER -> click(GENDER_OTHER);
        }
        return this;
    }

    public PracticeFormPage fieldMobileNumber(String mobile) {
        type(MOBILE_NUMBER_INPUT, mobile);
        return this;
    }

    public PracticeFormPage openDateOfBirth(String month, String year, String day) {
        find(DATE_INPUT).click();
        CalendarComponent calendar = new CalendarComponent(getDriver());
        calendar.selectDate(month, year, day);
        return this;
    }

//    public void selectMonth(String month) {
//        new Select()
//    }

    public PracticeFormPage fieldCurrentAddress(String address) {
        type(CURRENT_ADDRESS_INPUT, address);
        return this;
    }

    public PracticeFormPage fieldSubject(String subject) {
        type(SUBJECT_INPUT, subject);
        return this;
    }

    public void peakHobbiesSport() {
        click(HOBBIES_SPORT);
    }

    public void peakHobbiesReading() {
        click(HOBBIES_READING);
    }

    public void peakHobbiesMusic() {
        click(HOBBIES_MUSIC);
    }

    public void loadPicture() {
        click(PICTURE_LOAD_CLICK);
    }

    public PracticeFormPage clickDropdownState(String state) {
        scrollTo(STATE_DROPDOWN);
        click(STATE_DROPDOWN);
        type(STATE_SEARCH_INPUT, state);
        find(STATE_SEARCH_INPUT).sendKeys(Keys.ENTER);
        return this;
    }

    public PracticeFormPage clickDropdownCity(String city) {
        click(CITY_DROPDOWN);
        type(CITY_SEARCH_INPUT, city);
        find(CITY_SEARCH_INPUT).sendKeys(Keys.ENTER);
        return this;
    }

    public SubmitFormModal clickSubmitButton() {
        click(SUBMIT_BUTTON);
        return new SubmitFormModal(getDriver());
    }

    public PracticeFormPage open() {
        super.openURL(DemoQaLinks.PRACTICE_FORM);
        return this;
    }

}


/* Найти все локаторы которые возможно и выписывать внутри класса фромпейдж */