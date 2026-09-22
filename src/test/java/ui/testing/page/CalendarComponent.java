package ui.testing.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ui.testing.BasePage;

import java.util.List;

public class CalendarComponent extends BasePage {

    private final By MONTH_SELECT = By.xpath("//*[@class='react-datepicker__month-select']");
    private final By YEAR_SELECT = By.xpath("//*[@class='react-datepicker__year-select']");
    private final By DAY_SELECT = By.xpath("//div[contains(@class,'react-datepicker__day') and not(contains(@class,'--outside-month'))]");

    public CalendarComponent(WebDriver driver) {
        super(driver);
    }

    public void selectDate(String month, String year, String day) {
        selectMonth(month);
        selectYear(year);
        selectDay(day);
    }

    private void selectMonth(String month) {
        WebElement monthSelect = find(MONTH_SELECT);
        Select monthDropdown = new Select(monthSelect);
        monthDropdown.selectByVisibleText(month);
    }

    private void selectYear(String year) {
        WebElement yearSelect = find(YEAR_SELECT);
        Select yearDropdown = new Select((yearSelect));
        yearDropdown.selectByVisibleText(year);
    }

    private void selectDay(String day) {
        List<WebElement> days = getDriver().findElements(DAY_SELECT);
        for (WebElement d : days) {
            if (d.getText().trim().equals(day)) {
                d.click();
                return;
            }
        }
        throw new RuntimeException("День " + day + " не найден в календаре");
    }
}
